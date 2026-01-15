import os
import shutil

# COLOQUE O CAMINHO DA SUA PASTA AQUI
# Exemplo: r'C:\Usuarios\Nome\Desktop\Arquivos'
caminho_raiz = r'Substituir aqui pelo caminho da sua pasta'

def organizar_e_renomear(diretorio_base):
    # Lista tudo que está na pasta raiz
    for item in os.listdir(diretorio_base):
        caminho_subpasta = os.path.join(diretorio_base, item)

        # Verifica se é uma pasta
        if os.path.isdir(caminho_subpasta):
            arquivos = os.listdir(caminho_subpasta)
            
            if len(arquivos) > 0:
                # 1. Identifica o arquivo e sua extensão
                nome_arquivo_antigo = arquivos[0]
                extensao = os.path.splitext(nome_arquivo_antigo)[1]
                
                # 2. Define o novo nome e os caminhos
                novo_nome_arquivo = item + extensao
                caminho_antigo_completo = os.path.join(caminho_subpasta, nome_arquivo_antigo)
                caminho_final_fora = os.path.join(diretorio_base, novo_nome_arquivo)
                
                try:
                    # 3. Move o arquivo para fora já renomeando
                    shutil.move(caminho_antigo_completo, caminho_final_fora)
                    print(f"Sucesso: {item} -> {novo_nome_arquivo} movido para a raiz.")
                    
                    # 4. (Opcional) Remove a pasta que agora está vazia
                    os.rmdir(caminho_subpasta)
                except Exception as e:
                    print(f"Erro ao processar {item}: {e}")

if __name__ == "__main__":
    organizar_e_renomear(caminho_raiz)
