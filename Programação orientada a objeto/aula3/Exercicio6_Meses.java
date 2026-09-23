import javax.swing.JOptionPane;

// Exercício: armazenar os 12 meses do ano em um array, sortear um valor
// entre 0 e 11 e apresentar o mês correspondente ao valor sorteado.
public class Exercicio6_Meses {
    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                           "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int sorteado = (int) (Math.random() * 12); // gera de 0 a 11

        JOptionPane.showMessageDialog(null,
            "Valor sorteado: " + sorteado + "\nMês correspondente: " + meses[sorteado]);
        System.exit(0);
    }
}
