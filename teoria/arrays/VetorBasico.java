package teoria.arrays;

/* Defina um vetor para armazenar 6 números inteiros e:
• Atribua os valores a esse vetor: 1, 0, 5, -2, -5, 7.
• Calcule a soma dos valores armazenados na primeira, segunda e
sexta posições do vetor e mostre o resultado na tela.
• Modifique a 4ª posição do vetor, atribuindo o valor 100 a ela.
• Apresente cada um dos valor do vetor, um ao lado do outro. */

public class VetorBasico {
  public static void main(String[] args) {
    int[] vetor = {1, 0, 5, -2, -5, 7};
    int soma = vetor[0] + vetor[1] + vetor[5];
    System.out.print("A soma deles é igual a: " + soma);
    vetor[3] = 100;

    System.out.print("Valores do vetor: ");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }
  }
  
}
