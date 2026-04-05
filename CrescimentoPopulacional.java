public class CrescimentoPopulacional {
    public static void main(String[] args) {

        int populacaoA = 80000;
        int populacaoB = 200000;

        double taxaA = 0.03;   // 3%
        double taxaB = 0.015;  // 1.5%

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("Anos necessários: " + anos);
    }
}