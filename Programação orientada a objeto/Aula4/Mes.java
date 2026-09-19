// Exercício: método getMesPorExtenso que recebe o número do mês (1 a 12)
// e um código de idioma (1 = português, 2 = inglês) e retorna o mês por extenso.
public class Mes {
    public static String getMesPorExtenso(int mes, int idioma) {
        String[] mesesPt = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String[] mesesEn = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        if (mes < 1 || mes > 12) {
            return "Mês inválido";
        }

        if (idioma == 1) {
            return mesesPt[mes - 1];
        } else if (idioma == 2) {
            return mesesEn[mes - 1];
        } else {
            return "Idioma inválido";
        }
    }
}
