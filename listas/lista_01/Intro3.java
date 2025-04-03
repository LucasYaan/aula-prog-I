import java.util.Scanner;

public class Intro3 {
      public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // Solicite ao usuário o seu nome completo e escreva uma saudação para ele.
    System.out.print("Digite o seu nome completo: ");
    String nomeCompleto = entrada.nextLine();

    System.out.println("Olá, " + nomeCompleto + ", é um prazer conhecê-lo.");

    entrada.close();
  }
    
}