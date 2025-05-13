package atividades;

import java.util.Scanner;

/* Classe `Produto` com os atributos `nome` (String), `preco` (double) e `quantidade` (int). A classe deve conter:
- Construtor para inicializar os três atributos.
- Método `calcularValorTotal()` que retorna o valor total do estoque.
- Método `aplicarDesconto(double percentual)` que aplica um desconto ao preço do produto.
Teste a classe no método `main`, criando um produto, aplicando um desconto e exibindo as informações. */

public class Produto {
  Scanner entrada = new Scanner(System.in);

  String nome;
  double preco;
  int qtd;

  public Produto(String nome, double preco, int qtd) {
    this.nome = nome;
    this.preco = preco;
    this.qtd = qtd;
  }

  double calcularValorTotal(double preco, int qtd) {
    return preco * qtd;
  }

  public void aplicarDesconto(double desconto) {
    if (desconto >= 0 && desconto <= 100) {
      preco -= preco * (desconto / 100);
    } else {
      System.out.println("Desconto inválido");
    }
  }
  public static void main(String[] args) {
    Produto produto = new Produto(
      "Notebook", 
      3000.00, 
      2
      );

    System.out.println("Produto: " + produto.nome);
    System.out.println("Preço unitário: R$ " + produto.preco);
    System.out.println("Quantidade: " + produto.qtd);
    System.out.println("Valor total sem desconto: R$ " + produto.calcularValorTotal(produto.preco, produto.qtd));

    produto.aplicarDesconto(10);
    System.out.println("\nApós aplicar 10% de desconto:");
    System.out.println("Novo preço unitário: R$ " + produto.preco);
    System.out.println("Valor total com desconto: R$ " + produto.calcularValorTotal(produto.preco, produto.qtd));
  }
}
