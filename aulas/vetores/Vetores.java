package vetores;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[8];

		System.out.println("Entre com 8 valores inteiros");
		for(int i = 0; vetor.length; i++) { // *
			vetor[i] = entrada.nextInt();
		}

		System.out.println("Valores pares: ");
		for(int i = 0; vetor.length; i++) {  // *
			//
		}
    }
    
}
