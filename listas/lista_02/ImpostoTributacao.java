package listas.lista_02;
import java.util.Scanner;

/* A tributação de impostos aplica alíquotas diferentes para os produtos
Implemente um programa que leia o código de um determinado produto e mostre a sua classificação 

1             Alimento não-perecível
2, 3 ou 4     Alimento perecível
5 ou 6        Vestuário
7             Higiene pessoal
8, 9, 10      Utensílios domésticos
Outro         Categoria inválida
*/

public class ImpostoTributacao {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o código da categoria do produto");
    int codCategoria = entrada.nextInt();
    String classificacao;

    if (codCategoria == 1) {
      classificacao = "Alimento não-perecível";
    } 
    else if (codCategoria == 2 || codCategoria == 3 || codCategoria == 4) {
      classificacao = "Alimento perecível";
    }
    else if (codCategoria == 5 || codCategoria == 6) {
      classificacao = "Vestuário";
    }
    else if (codCategoria == 7) {
      classificacao = "Higiene Pessoal";
    }
    else if (codCategoria == 8 || codCategoria == 9 || codCategoria == 10) {
      classificacao = "Utensílios Domésticos";
    }
    else {
      classificacao = "Categoria inválida";
    }

    System.out.println("Classificação: " + classificacao);
    entrada.close();
  }
}
