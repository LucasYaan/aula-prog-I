package atividades;
import java.lang.Math;

public class Circulo {
  double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  double calcularArea() {
    return Math.PI * raio * raio;
  }
  double calcularPerimetro() {
    return 2 * Math.PI * raio;
  }
  public static void main(String[] args) {
    Circulo circulo = new Circulo(3.0);
  
    double area = circulo.calcularArea();
    double perimetro = circulo.calcularPerimetro();
  
    System.out.println("Área do círculo: " + area);
    System.out.println("Perímetro do círculo: " + perimetro);
  }
  
}
