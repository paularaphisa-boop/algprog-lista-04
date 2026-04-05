import java.util.Scanner;

public class UsuarioSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String senha;

        while (true) {
            System.out.print("Digite o nome do usuário: ");
            usuario = scanner.nextLine();

            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            if (!senha.equals(usuario)) {
                System.out.println("Cadastro realizado com sucesso!");
                break;
                } else {
                    System.out.println("ERRO: Senha igual ao usuário. Tente novamente.");
                }
        }
        scanner.close();
    }
    
}
