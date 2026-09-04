import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite o seu peso em kg (ex: 70.5): ");
            float peso = leitor.nextFloat();

            System.out.print("Digite a sua altura em metros (ex: 1.75): ");
            float altura = leitor.nextFloat();

            float imc = peso / (altura * altura);

            System.out.printf("Seu IMC é: %.2f\n", imc);

            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso");
            } else if (imc < 25.0) {
                System.out.println("Classificação: Peso normal");
            } else if (imc < 30.0) {
                System.out.println("Classificação: Sobrepeso");
            } else {
                System.out.println("Classificação: Obesidade");
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite apenas números.");
        } finally {
            leitor.close();
        }
    }
}