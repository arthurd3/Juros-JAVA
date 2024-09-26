import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Le = new Scanner(System.in);


        System.out.println("Digite a Mensalidade:");
        double mensalidade = Le.nextDouble();
        System.out.println("Digite a Taxa de Juros (em %):");
        double juros = Le.nextDouble();
        System.out.println("Digite a Quantidade de Meses:");
        int meses = Le.nextInt();

        
        calcularJuros(mensalidade, juros, meses);
        
        
    }


    public static void calcularJuros(double mensalidade, double juros, int meses) {
        
        double total = mensalidade * Math.pow(1 + (juros / 100), meses);

      
        System.out.println("Mensalidade: " + mensalidade);
        System.out.println("Valor Final após " + meses + " meses: " + total);
    }
}
