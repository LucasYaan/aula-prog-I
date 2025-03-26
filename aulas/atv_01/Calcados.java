package atv_01;
import java.util.Scanner;

/* Solicitar ao usuário um valor de desconto, aplicado ao valor de todos os produtos. 
   desconto = valorTotal - valorTotal*0,
   Apresente os valores dos novos preços. */

public class Calcados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] produtos = new double[10];
        
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Quanto vale este produto? ");
            produtos[i] = entrada.nextDouble();
        }
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Qual o desconto deste produto em decimal? ");
        }
    }

}
