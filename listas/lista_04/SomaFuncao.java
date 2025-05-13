package listas.lista_04;

import java.util.Scanner;

/* Leia dois números inteiros dados pelo usuário e some-os usando uma
função para isso. Deste modo, implemente um método chamado soma que, tendo recebido os
valores lidos como parâmetro, calcule e retorne o resultado da soma envolvendo esses dois valores. */

public class SomaFuncao {
  
  public static int soma(int x, int y) {
    return x + y;
  }
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite dois números inteiros; ");
    int x = entrada.nextInt();
    int y = entrada.nextInt();

    int res = soma(x, y);

    System.out.println("A soma dos dois números é: " + res);
    entrada.close();
  }

}
