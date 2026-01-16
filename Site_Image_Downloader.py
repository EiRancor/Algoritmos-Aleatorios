import requests
from bs4 import BeautifulSoup
from urllib.parse import urljoin, urlparse
import os
from pathlib import Path

def baixar_imagens(url, pasta_destino='imagens'):
    """
    Baixa todas as imagens de um site
    
    Args:
        url: URL do site
        pasta_destino: Pasta onde as imagens serão salvas
    """
    # Criar pasta se não existir
    Path(pasta_destino).mkdir(parents=True, exist_ok=True)
    
    try:
        # Fazer requisição ao site
        headers = {
            'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36'
        }
        response = requests.get(url, headers=headers, timeout=10)
        response.raise_for_status()
        
        # Parse do HTML
        soup = BeautifulSoup(response.content, 'html.parser')
        
        # Encontrar todas as tags de imagem
        imagens = soup.find_all('img')
        
        print(f"Encontradas {len(imagens)} imagens no site.")
        
        contador = 0
        for img in imagens:
            # Pegar URL da imagem
            img_url = img.get('src') or img.get('data-src')
            
            if not img_url:
                continue
            
            # Converter URL relativa para absoluta
            img_url = urljoin(url, img_url)
            
            try:
                # Baixar imagem
                img_response = requests.get(img_url, headers=headers, timeout=10)
                img_response.raise_for_status()
                
                # Extrair nome do arquivo da URL
                nome_arquivo = os.path.basename(urlparse(img_url).path)
                
                # Se não houver nome, gerar um
                if not nome_arquivo or '.' not in nome_arquivo:
                    extensao = img_response.headers.get('content-type', '').split('/')[-1]
                    if extensao in ['jpeg', 'jpg', 'png', 'gif', 'webp', 'svg+xml']:
                        extensao = extensao.replace('svg+xml', 'svg')
                        nome_arquivo = f"imagem_{contador}.{extensao}"
                    else:
                        nome_arquivo = f"imagem_{contador}.jpg"
                
                # Salvar imagem
                caminho_completo = os.path.join(pasta_destino, nome_arquivo)
                
                # Evitar sobrescrever arquivos
                base, ext = os.path.splitext(nome_arquivo)
                n = 1
                while os.path.exists(caminho_completo):
                    nome_arquivo = f"{base}_{n}{ext}"
                    caminho_completo = os.path.join(pasta_destino, nome_arquivo)
                    n += 1
                
                with open(caminho_completo, 'wb') as f:
                    f.write(img_response.content)
                
                contador += 1
                print(f"✓ Baixada: {nome_arquivo}")
                
            except Exception as e:
                print(f"✗ Erro ao baixar {img_url}: {e}")
        
        print(f"\n{contador} imagens baixadas com sucesso na pasta '{pasta_destino}'!")
        
    except Exception as e:
        print(f"Erro ao acessar o site: {e}")


# Exemplo de uso
if __name__ == "__main__":
    # Insira a URL do site aqui
    url_site = input("Digite a URL do site: ")
    pasta = input("Digite o nome da pasta de destino (Enter para 'imagens'): ").strip() or 'imagens'
    
    baixar_imagens(url_site, pasta)
