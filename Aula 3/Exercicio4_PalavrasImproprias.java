import javax.swing.JOptionPane;

// Exercício: receber uma frase e verificar se ela contém as palavras
// impróprias "sexo" ou "sexual", exibindo a mensagem correspondente.
public class Exercicio4_PalavrasImproprias {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Forneça uma frase:");
        String fraseMinuscula = frase.toLowerCase(); // ignora maiúsculas/minúsculas

        String mensagem = "conteúdo liberado";
        if (fraseMinuscula.indexOf("sexo") != -1 || fraseMinuscula.indexOf("sexual") != -1) {
            mensagem = "conteúdo impróprio";
        }

        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
}
