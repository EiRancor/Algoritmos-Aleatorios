// Exercício: classe Contagem com 4 métodos sobrecarregados chamados "contar",
// conforme a tabela do slide (sem parâmetros, com fim, com início/fim,
// e com início/fim/pausa entre segundo).
public class Contagem {

    // Apresenta em tela a contagem dos números de 1 a 10.
    public static void contar() {
        contar(1, 10);
    }

    // Apresenta em tela a contagem dos números de 1 até o valor definido pela variável fim.
    public static void contar(int fim) {
        contar(1, fim);
    }

    // Apresenta em tela a contagem dos números com valor inicial e final definidos.
    public static void contar(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }
    }

    // Apresenta em tela a contagem com pausa (em segundos) a cada valor impresso.
    public static void contar(int inicio, int fim, int pausa) {
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
            try {
                Thread.sleep(pausa * 1000);
            } catch (InterruptedException erro) {
                System.out.println("Erro durante a pausa: " + erro.toString());
            }
        }
    }
}
