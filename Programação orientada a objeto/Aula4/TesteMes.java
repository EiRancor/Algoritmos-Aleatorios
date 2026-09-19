import javax.swing.JOptionPane;

// Classe para testar o método getMesPorExtenso da classe Mes,
// reproduzindo os exemplos da tabela do slide.
public class TesteMes {
    public static void main(String[] args) {
        String resultado = "Testes do método getMesPorExtenso:\n\n"
                + "Mes.getMesPorExtenso(1, 1) = " + Mes.getMesPorExtenso(1, 1) + "\n"
                + "Mes.getMesPorExtenso(2, 2) = " + Mes.getMesPorExtenso(2, 2) + "\n"
                + "Mes.getMesPorExtenso(3, 1) = " + Mes.getMesPorExtenso(3, 1) + "\n"
                + "Mes.getMesPorExtenso(4, 2) = " + Mes.getMesPorExtenso(4, 2) + "\n"
                + "Mes.getMesPorExtenso(5, 1) = " + Mes.getMesPorExtenso(5, 1) + "\n"
                + "Mes.getMesPorExtenso(6, 2) = " + Mes.getMesPorExtenso(6, 2);

        JOptionPane.showMessageDialog(null, resultado);
        System.exit(0);
    }
}
