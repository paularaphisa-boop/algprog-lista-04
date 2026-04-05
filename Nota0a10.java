import java.util.Scanner;

public class Nota0a10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        while (true){ 
        System.out.println("Digite uma nota entre 0 e 10: ");
        
        if (scanner.hasNextInt()) {
            nota = scanner.nextInt();

        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota válida: " + nota);
            break;
        }       
        else {
            System.out.println("Valor inválido! A nota deve estar entre 0 e 10.\n");
        } 
    } else {
            System.out.println("Digite uma nota entre 0 e 10: ");
             scanner.next(); 
    }       
        }
          
          scanner.close();
    }
}
