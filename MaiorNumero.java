import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero, maior;

        System.out.print("Digite o 1º número: ");
        maior = sc.nextDouble();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextDouble();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}