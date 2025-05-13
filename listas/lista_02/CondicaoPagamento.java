package listas.lista_02;
import java.util.Scanner;

/* Calcule e apresente quanto deve ser pago por um produto considerando a
leitura do preço de etiqueta (PE) e o código da condição de pagamento (CP).

1 À vista em dinheiro ou cheque, com 10% de desconto
2 À vista com cartão de crédito, com 5% de desconto
3 Em 2 vezes, preço normal de etiqueta sem juros
4 Em 3 vezes, preço de etiqueta com acréscimo de 10 */

public class CondicaoPagamento {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // Entrada de dados
    System.out.print("Qual o valor do produto? ");
    double precoProduto = entrada.nextDouble();
    System.out.print("Digite o código da condição de pagamento (1 a 4): ");
    int codPagamento = entrada.nextInt();

    double valorFinal;
    
    // SWITCH CASE para digitar código de pagamento
    switch (codPagamento) {
      case 1:
        valorFinal = precoProduto * 0.9;
        break;
      case 2:
        valorFinal = precoProduto * 0.95;
        break;
      case 3:
        valorFinal = precoProduto;
        break;
      case 4:
        valorFinal = precoProduto * 1.1;
        break;    
      default:
        System.out.print("Código de pagamento inválido!");
        return;
    }
    System.out.printf("Deve ser pago %.2f%n pelo produto", valorFinal);
    entrada.close();
  }
  
}
