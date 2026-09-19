// Classe para testar os quatro métodos sobrecarregados "contar" da classe Contagem.
public class TesteContagem {
    public static void main(String[] args) {
        System.out.println("Contagem padrão (1 a 10):");
        Contagem.contar();

        System.out.println("\nContagem de 1 até 5:");
        Contagem.contar(5);

        System.out.println("\nContagem de 3 até 8:");
        Contagem.contar(3, 8);

        System.out.println("\nContagem de 1 até 5 com pausa de 1 segundo:");
        Contagem.contar(1, 5, 1);
    }
}
