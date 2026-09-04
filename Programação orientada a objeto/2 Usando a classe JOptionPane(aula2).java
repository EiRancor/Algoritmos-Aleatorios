import javax.swing.JOptionPane;

public class CalculadoraDivisao {
    public static void main(String[] args) {
        String aux1, aux2;
        int num1, num2, resultado;

        try {
            aux1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
            num1 = Integer.parseInt(aux1);

            aux2 = JOptionPane.showInputDialog("Digite o segundo número inteiro:");
            num2 = Integer.parseInt(aux2);

            resultado = num1 / num2;

            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números inteiros válidos!");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: Não é possível dividir por zero!");
        } finally {
            JOptionPane.showMessageDialog(null, "Execução do bloco Try Catch Finalizada.");
        }
    }
}