package teoria.estruturas;
import java.util.Scanner;

/* 
Quantidade de:
• jovens pesquisados (idade menor que 20 anos);
• adultos pesquisados (entre 20 e 59 anos);
• melhor idade (idade maior ou igual a 60).
Como a quantidade de pessoas pesquisadas pode variar, o fim de
entrada de dados será dado quando o usuário informar um valor
negativo para a idade.
Faça um programa que colete, calcule e exiba a informações apuradas
pela pesquisa. */

public class PesquisaIdades {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int jovens = 0;
    int adultos = 0;
    int melhorIdade = 0;

    while (true) {
      System.out.print("Digite a idade da pesoa (número neg para encerrar): ");
      int idade = entrada.nextInt();

      if (idade < 0) {
        break;        
      }
      else if (idade < 20) {
        jovens++;
      }
      else if (idade >= 20 && idade < 60) {
        adultos++;
      }
      else if (idade >= 60) {
        melhorIdade++;
      }
    }
    System.out.println("\nResultado da pesquisa:");
    System.out.println("Quantidade de jovens (<20): " + jovens);
    System.out.println("Quantidade de adultos (20 a 59): " + adultos);
    System.out.println("Quantidade de pessoas da melhor idade (60+): " + melhorIdade);

    entrada.close();
  }
}
