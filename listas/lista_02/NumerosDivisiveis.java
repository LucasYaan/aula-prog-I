package listas.lista_02;

public class NumerosDivisiveis {
  public static void main(String[] args) {
      System.out.println("Números entre 1 e 100 divisíveis por 3:");
      for (int i = 1; i <= 100; i++) {
          if (i % 3 == 0) {
              System.out.print(i + " ");
          }
      }

      System.out.println("\n\nNúmeros entre 1 e 100 divisíveis por 5:");
      for (int i = 1; i <= 100; i++) {
          if (i % 5 == 0) {
              System.out.print(i + " ");
          }
      }

      System.out.println("\n\nNúmeros entre 1 e 100 divisíveis por 3 e 5 ao mesmo tempo:");
      for (int i = 1; i <= 100; i++) {
          if (i % 3 == 0 && i % 5 == 0) {
              System.out.print(i + " ");
          }
      }
  }
}

