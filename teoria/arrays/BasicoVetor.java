package teoria.arrays;

import java.util.Scanner;

/* Desenvolva um programa que leia oito valores do teclado e os
armazene em um vetor
Em seguida leia dois valores X e Y quaisquer correspondentes a duas
posições do vetor e calcule a soma dos valores encontrados nestas
posições. */

public class BasicoVetor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int vetor[] = new int[8];

    for (int i = 0; i < vetor.length; i++ ) {
      System.out.printf("Digite o %dº valor: ", i+1);
      vetor[i] = entrada.nextInt();
    }
    System.out.print("Digite dois valores do vetor para serem somados: ");
    int x = entrada.nextInt();
    int y = entrada.nextInt();
    if ((x >= 0 && x <= 7) && (y >= 0 && y <= 8)) {
      int soma = vetor[x] + vetor[y];
      System.out.println("Soma dos valores nas posições " + x + " e " + y + " = " + soma);
    } else {
      System.out.print("Posição inválida!");
    }

  }
}
