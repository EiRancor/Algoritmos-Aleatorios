import javax.swing.JOptionPane;

// Exercício: simular acesso a um sistema com login e senha "java8",
// dando 3 chances ao usuário e avisando quantas tentativas restam.
public class Exercicio1_LoginSenha {
    public static void main(String[] args) {
        String loginOriginal = "java8";
        String senhaOriginal = "java8";
        int tentativas = 3;
        boolean acessoLiberado = false;

        while (tentativas > 0 && !acessoLiberado) {
            String login = JOptionPane.showInputDialog("Informe o login:");
            String senha = JOptionPane.showInputDialog("Informe a senha:");

            if (login.equals(loginOriginal) && senha.equals(senhaOriginal)) {
                acessoLiberado = true;
                JOptionPane.showMessageDialog(null, "Acesso liberado! Bem-vindo.");
            } else {
                tentativas--;
                if (tentativas > 0) {
                    JOptionPane.showMessageDialog(null,
                        "Login ou senha incorretos!\nTentativas restantes: " + tentativas);
                } else {
                    JOptionPane.showMessageDialog(null,
                        "Login ou senha incorretos!\nVocê esgotou suas tentativas. Acesso bloqueado.");
                }
            }
        }
        System.exit(0);
    }
}
