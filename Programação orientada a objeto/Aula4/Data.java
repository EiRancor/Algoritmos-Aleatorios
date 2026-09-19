// Exercício: classe Data com métodos getDia, getMes e getAno, que recebem
// uma data em formato texto "dd/mm/aaaa" e retornam o valor correspondente.
// Caso a data esteja fora do padrão, os métodos retornam 0.
public class Data {

    public static int getDia(String data) {
        if (!validarFormato(data)) {
            return 0;
        }
        return Integer.parseInt(data.substring(0, 2));
    }

    public static int getMes(String data) {
        if (!validarFormato(data)) {
            return 0;
        }
        return Integer.parseInt(data.substring(3, 5));
    }

    public static int getAno(String data) {
        if (!validarFormato(data)) {
            return 0;
        }
        return Integer.parseInt(data.substring(6, 10));
    }

    // Verifica se a string está no padrão dd/mm/aaaa (10 caracteres,
    // com as barras nas posições certas e apenas dígitos nos demais campos).
    private static boolean validarFormato(String data) {
        if (data == null || data.length() != 10) {
            return false;
        }
        if (data.charAt(2) != '/' || data.charAt(5) != '/') {
            return false;
        }
        try {
            Integer.parseInt(data.substring(0, 2));
            Integer.parseInt(data.substring(3, 5));
            Integer.parseInt(data.substring(6, 10));
        } catch (NumberFormatException erro) {
            return false;
        }
        return true;
    }
}
