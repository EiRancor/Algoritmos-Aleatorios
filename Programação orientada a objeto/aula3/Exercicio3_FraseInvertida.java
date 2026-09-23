import javax.swing.JOptionPane;

// Exercício: receber uma frase e mostrá-la de trás para frente e sem espaços em branco.
public class Exercicio3_FraseInvertida {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase:");
        frase = frase.replace(" ", ""); // remove os espaços

        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }

        JOptionPane.showMessageDialog(null, "Frase invertida e sem espaços: " + invertida);
        System.exit(0);
    }
}
