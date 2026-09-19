import javax.swing.JOptionPane;

// Classe para testar os métodos getDia, getMes e getAno da classe Data,
// reproduzindo o exemplo de saída mostrado no slide (Dia: 27, Mês: 9, Ano: 2014).
public class TesteData {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("Informe uma data no formato dd/mm/aaaa:");

        int dia = Data.getDia(data);
        int mes = Data.getMes(data);
        int ano = Data.getAno(data);

        JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
        System.exit(0);
    }
}
