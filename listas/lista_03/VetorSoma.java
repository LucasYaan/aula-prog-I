package listas.lista_03;
import java.util.Scanner;

/* Crie um programa que receba 10 números inteiros, armazenando-os em um vetor. 
Em seguida  calcule a soma de todos os seus elementos. */

public class VetorSoma {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] numeros = new int[10];
    int cont = 0;

    for (int n = 0; n < 10; n++) {
      System.out.print("Digite um número inteiro: ");
      numeros[n] = entrada.nextInt();
      cont = cont + numeros[n];
    }
    
    System.out.printf("Entrada: ");
    for (int n = 0; n < 10; n++) {
      System.out.printf("%d ", numeros[n]);
    } 
    System.out.printf("Soma dos valores: %d", cont);
  }
}

