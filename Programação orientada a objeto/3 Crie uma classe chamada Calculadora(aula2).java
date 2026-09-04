import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        String aux1, aux2, opcaoStr;
        double num1, num2, resultado = 0;
        int opcao;

        try {
            // Leitura dos dois números
            aux1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            num1 = Double.parseDouble(aux1);

            aux2 = JOptionPane.showInputDialog("Digite o segundo número:");
            num2 = Double.parseDouble(aux2);

            // Menu de opções
            opcaoStr = JOptionPane.showInputDialog(
                "--- MENU CALCULADORA ---\n" +
                "1 - Soma (+)\n" +
                "2 - Subtração (-)\n" +
                "3 - Multiplicação (*)\n" +
                "4 - Divisão (/)\n\n" +
                "Escolha a operação (1 a 4):"
            );
            opcao = Integer.parseInt(opcaoStr);

            // Verificação de opção inexistente com if/else
            if (opcao < 1 || opcao > 4) {
                // Lança exceção tratada no catch
                throw new IllegalArgumentException("Opção inexistente!");
            }

            // Seleção da operação com switch-case
            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    // Verificação do divisor com if/else
                    if (num2 == 0) {
                        throw new ArithmeticException("Divisão por zero!");
                    }
                    resultado = num1 / num2;
                    break;
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida! Digite apenas números.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null, "Finalização da execução do programa.");
        }
    }
}