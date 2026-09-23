import javax.swing.JOptionPane;

// Exercício: receber 5 notas via showInputDialog, armazenar em um array,
// apresentar em ordem decrescente e calcular a média aritmética.
public class Exercicio5_Notas {
    public static void main(String[] args) {
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(
                JOptionPane.showInputDialog("Informe a nota do aluno " + (i + 1) + ":"));
            soma += notas[i];
        }

        // Ordenação decrescente (bubble sort simples)
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] < notas[j + 1]) {
                    double temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }

        String resultado = "Notas em ordem decrescente:\n";
        for (double nota : notas) {
            resultado += nota + "\n";
        }
        double media = soma / notas.length;
        resultado += "\nMédia aritmética: " + media;

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}
