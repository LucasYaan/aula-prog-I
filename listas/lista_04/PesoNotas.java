package listas.lista_04;

import java.util.Scanner;

/* Método MÉDIA (nota, peso)
  return media
Receba três notas e seus respectivos pesos a partir do teclado,
passando-os como argumento para um método que calcule média. A sub-rotina deverá calcular e
retornar a média ponderada das notas recebidas como parâmetro, considerando os respectivos
pesos */

public class PesoNotas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double[] notas = new double[3];
    int[] pesos = new int[3];


    for (int i = 0; i < 3; i++) {
      System.out.printf("Digite a %nª nota: ", i+1);
      notas[i] = entrada.nextDouble();
      System.out.printf("Digite o %dº peso: ", i+1);
      pesos[i] = entrada.nextInt();      
    }

    double media = media(notas, pesos);
    System.out.print("A média final será de: " + media);

    entrada.close();
  }
  
  public static double media(double[] notas, int[] pesos) {
    double somaTotal = 0;
    int somaPesos = 0;

    for (int i = 0; i < 3; i++) {
      double notaComPeso = notas[i] * pesos[i];
      somaTotal = somaTotal + notaComPeso;
    }
    for (int i = 0; i < 3; i++) {
      somaPesos += pesos[i];
    }

    double resultadoMedia = somaTotal / somaPesos;
    return resultadoMedia;
}

}
