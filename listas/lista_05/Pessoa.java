package listas.lista_05;
/* Crie a classe Pessoa
2 atributos: nome e idade.
Crie duas instâncias da classe Pessoa, defina valores para cada uma de suas propriedades e
apresente as informações na tela. */

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public static void main(String[] args) {

    Pessoa p1 = new Pessoa("Lucas", 20);
    Pessoa p2 = new Pessoa("Edna", 58);

    System.out.printf("A primeira pessoa se chama %s e tem %d anos", p1.getNome(), p1.getIdade());
    System.out.printf("A segunda pessoa se chama %s e tem %d anos", p2.getNome(), p2.getIdade());
  }
}
