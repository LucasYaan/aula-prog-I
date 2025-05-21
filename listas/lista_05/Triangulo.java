package listas.lista_05;

/* esses elementos podem ser caracterizados pelas medidas de sua base e
de sua altura. Crie um método nesta classe que permita calcular e retornar a área da figura.
Adicionalmente, codifique um programa que instancie três objetos desse tipo, defina valores para
seus atributos e mostre na tela a área de cada um deles. */

public class Triangulo {
  private double base;
  private double altura;

  public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

    public double getAltura() {
    return altura;
  }

  public double areaTriangulo() {
    return (base * altura) / 2;
  }

  public static void main(String[] args) {
    Triangulo t1 = new Triangulo(3, 4);
    Triangulo t2 = new Triangulo(3.5, 5.75);
    Triangulo t3 = new Triangulo(2, 10);

    System.out.printf("Área do triângulo 1: %.2f\n", t1.areaTriangulo());
    System.out.printf("Área do triângulo 2: %.2f\n", t2.areaTriangulo());
    System.out.printf("Área do triângulo 3: %.2f\n", t3.areaTriangulo());
  }
}
