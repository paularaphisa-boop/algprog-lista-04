import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        // Garantir ordem crescente
        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Números no intervalo:");

        // Exibe os números ENTRE eles (excluindo os extremos)
        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}