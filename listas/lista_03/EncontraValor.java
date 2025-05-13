package listas.lista_03;
import java.util.Scanner;

/* Receba um vetor de dez números inteiros e um valor a ser buscado, 
verificando se o valor informado está presente no vetor. 
Se estiver presente, informe o índice em que ele se encontra; 
caso contrário informe “valor não localizado”. */

public class EncontraValor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int[] vetor = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um número inteiro: ");
      vetor[i] = entrada.nextInt();
    }
    System.out.print("Digite um valor a ser buscado: ");
    int valorBuscado = entrada.nextInt();

    int indiceEncontrado = -1;
    for (int i = 0; i < 10; i++) {
      if (vetor[1] == valorBuscado) {
        indiceEncontrado = i;
        break;
      }
    }

    if(indiceEncontrado != -1) {
      System.out.println("Valor encontrado no índice: " + indiceEncontrado);
    } else {
      System.out.println("Valor não localizado.");
    }
  entrada.close();
  }
  
}
