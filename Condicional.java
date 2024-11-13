import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 0.0;
        String tipoPlano = "plus";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do filme: ");
        notaDoFilme = scanner.nextDouble();

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

       if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
           System.out.println("Filme liberado");
       } else {
           System.out.println("Deve pagar a locação");
       }
    }
}