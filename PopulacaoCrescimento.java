import java.util.Scanner;

public class PopulacaoCrescimento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            double populacaoA, populacaoB;
            double taxaA, taxaB;
            int anos = 0;

            do {
                System.out.print("Informe a população do país A (maior que 0): ");
                populacaoA = sc.nextDouble();
            } while (populacaoA <= 0);

            do {
                System.out.print("Informe a população do país B (maior que 0): ");
                populacaoB = sc.nextDouble();
            } while (populacaoB <= 0);

            do {
                System.out.print("Informe a taxa de crescimento de A (%): ");
                taxaA = sc.nextDouble();
            } while (taxaA <= 0);

            do {
                System.out.print("Informe a taxa de crescimento de B (%): ");
                taxaB = sc.nextDouble();
            } while (taxaB <= 0);

            taxaA /= 100;
            taxaB /= 100;

            if (populacaoA >= populacaoB) {
                System.out.println("A população de A já é maior ou igual à de B.");
            } else if (taxaA <= taxaB) {
                System.out.println("A população de A não ultrapassará B com essas taxas.");
            } else {
            
                while (populacaoA < populacaoB) {
                    populacaoA += populacaoA * taxaA;
                    populacaoB += populacaoB * taxaB;
                    anos++;
                }

                System.out.println("Anos necessários: " + anos);
            }

            
            System.out.print("Deseja repetir? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        sc.close();
    }
}