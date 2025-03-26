package atv_01;
import java.util.Scanner;

public class Calcados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float[] produtos = new float[10];
        
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Quanto vale o produto %d? ", i + 1);
            produtos[i] = entrada.nextFloat();
        }
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Qual o desconto do produto %d em decimal? ", i + 1);
            float desconto = entrada.nextFloat();
            produtos[i] *= (1 - desconto);
        }
        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Produto %d: Preço final R$%.2f%n", i + 1, produtos[i]);
        }
        entrada.close();
    }

}
