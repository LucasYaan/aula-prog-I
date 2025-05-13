package aula_03;

import java.util.Scanner;

public class Imagine {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas publicações você quer analisar: ");
        int numPubs = entrada.nextInt();
        int totalLikes = 0;

        for (int i = 1; i <= numPubs; i++) {
            System.out.printf("Quantas curtidas a publicação #%d tem? ", 1); // printf e %d
            int likes = entrada.nextInt();
            totalLikes += likes;
                if (likes >= 100) {
                    System.out.println("Publicação Popular!");
                } else {
                    System.out.println("Publicação com poucas curtidas.");
                }
        }

        double avgLikes = (double) totalLikes / numPubs;
        System.out.printf("Esta é a média de curtidas das publicações = %.1f\n", avgLikes);
        System.out.printf("Número de publicações = %d\n", numPubs);

        entrada.close();
    }
    
}
