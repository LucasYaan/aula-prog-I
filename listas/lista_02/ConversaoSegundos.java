package listas.lista_02;
import java.util.Scanner;

// Implemente um programa em Java que converta segundos para horas, minutos e segundos.
// Informe a quantidade de segundos: 86399 -> Equivale a: 23:59:59

public class ConversaoSegundos {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Quantos segundos você quer converter? ");
    int totalSegundos = entrada.nextInt();

    int horas = totalSegundos / 3600;
    int minutos = (totalSegundos % 3600) / 60;
    int segundos = totalSegundos % 60;

    System.out.printf("%d equivale a: %d:%d:%d", totalSegundos, horas, minutos, segundos);
    entrada.close();
  }
}
