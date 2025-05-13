package teoria.arrays;
import java.util.Scanner;

/*
• Faça um programa que permita que João entre com o valor pago pelo
produto no mercado ABC, assim como, o preço deste mesmo produto
em outras 5 lojas diferentes que ele pesquisará. 
A seguir, calcule e mostre em quantas lojas o preço praticado 
é superior ao preço que ele tem pago por este produto no mercado ABC.
 */

public class ControlandoGastos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    //entrada de dados
    System.out.print("Quanto você paga pelo produto no ABC? ");
    double precoABC = entrada.nextDouble();
    double[] precos = new double[5];
    int cont = 0;

    for (int i = 0; i < 5; i++) {
      System.out.printf("Quanto você paga pelo produto no %dº mercado? ", i+1);
      precos[i] = entrada.nextDouble();
      if (precos[i] < precoABC) {
        System.out.print("Vale mais a pena comprar neste mercado!");
        cont = cont + 1;
      }
    }
    System.out.println("\nNúmero de mercados onde o preço é superior ao do ABC: " + cont);
    entrada.close();
  }
  
}
