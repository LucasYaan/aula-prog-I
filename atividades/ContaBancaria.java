package atividades;

/* Classe `ContaBancaria` com os atributos `numeroConta` (String), `titular` (String) e `saldo` (double). A classe deve conter:

- Construtor com os 3 atributos
- Métodos `depositar(double valor)` e `sacar(double valor)`
- Método `exibirSaldo()` que imprime o saldo atual.
O método `sacar` deve permitir o saque apenas se houver saldo suficiente.

Teste a classe no método `main`, realizando depósitos, saques e exibindo o saldo da conta. */

public class ContaBancaria {
  String numeroConta;
  String titular;
  double saldo;

  public ContaBancaria(String numeroConta, String titular, double saldo) {
    this.numeroConta = numeroConta;
    this.titular = titular;
    this.saldo = saldo;
  }

  double depositar(double valor) {
    saldo += valor;
    return saldo;
  }

  double sacar(double valor) {
    if (saldo >= valor) {
      saldo -= valor;
    } else {
    System.out.printf("Saldo Insuficiente! Você não possui saldo suficiente para sacar %n reais ", valor);
    }
    return saldo;
  }

  void exibirSaldo() {
    System.out.printf("O seu saldo atual é de %n reais!", saldo);
  }

  public static void main(String[] args) {
    ContaBancaria contaBancaria = new ContaBancaria(
      "567890-1", 
      "Cléber", 
      3000
      );
      
    contaBancaria.exibirSaldo();

    contaBancaria.depositar(500);
    contaBancaria.exibirSaldo();

    contaBancaria.sacar(1000);
    contaBancaria.exibirSaldo();

    contaBancaria.sacar(4000);
    contaBancaria.exibirSaldo();

  }
}
