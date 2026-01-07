/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_boucles_tableaux;

import java.util.Scanner;

public class Ex1Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer n : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n doit être > 0");
            return;
        }

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // division réelle
        }

        System.out.printf("Somme harmonique H_%d = %.6f%n", n, sum);
    }
}
