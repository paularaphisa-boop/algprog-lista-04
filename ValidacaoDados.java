import java.util.Scanner;

public class ValidacaoDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        // Nome
        while (true) {
            System.out.print("Digite o nome (mais de 3 caracteres): ");
            nome = scanner.nextLine();

            if (nome.length() > 3) {
                break;
            } else {
                System.out.println("Nome inválido!");
            }
        }

        // Idade
        while (true) {
            System.out.print("Digite a idade (0 a 150): ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade >= 0 && idade <= 150) {
                    break;
                } else {
                    System.out.println("Idade inválida!");
                }
            } else {
                System.out.println("Digite um número válido!");
                scanner.next(); // limpa entrada inválida
            }
        }

        // Salário
        while (true) {
            System.out.print("Digite o salário (maior que 0): ");
            if (scanner.hasNextDouble()) {
                salario = scanner.nextDouble();
                if (salario > 0) {
                    break;
                } else {
                    System.out.println("Salário inválido!");
                }
            } else {
                System.out.println("Digite um número válido!");
                scanner.next();
            }
        }

        // Sexo
        while (true) {
            System.out.print("Digite o sexo (f/m): ");
            sexo = scanner.next().toLowerCase().charAt(0);

            if (sexo == 'f' || sexo == 'm') {
                break;
            } else {
                System.out.println("Sexo inválido!");
            }
        }

        // Estado Civil
        while (true) {
            System.out.print("Digite o estado civil (s/c/v/d): ");
            estadoCivil = scanner.next().toLowerCase().charAt(0);

            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
                break;
            } else {
                System.out.println("Estado civil inválido!");
            }
        }

        System.out.println("\nDados válidos informados com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();
    }
}