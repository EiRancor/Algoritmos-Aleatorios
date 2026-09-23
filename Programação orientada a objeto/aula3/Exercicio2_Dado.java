import javax.swing.JOptionPane;

// Exercício: simular a jogada de um dado de seis lados por três vezes,
// somando os valores e apresentando o resultado das três jogadas.
public class Exercicio2_Dado {
    public static void main(String[] args) {
        int soma = 0;
        String resultado = "";

        for (int i = 1; i <= 3; i++) {
            int valor = (int) (Math.random() * 6) + 1; // gera de 1 a 6
            resultado += "Jogada " + i + ": " + valor + "\n";
            soma += valor;
        }
        resultado += "\nSoma total: " + soma;

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}
