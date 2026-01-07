/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_boucles_tableaux;

import java.util.Scanner;

public class Ex3OddSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de valeurs : ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("n doit être > 0");
            return;
        }

        int[] odd = new int[n];
        int[] square = new int[n];

        for (int i = 0; i < n; i++) {
            odd[i] = 2 * i + 1;
            square[i] = odd[i] * odd[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(odd[i] + " a pour carre " + square[i]);
        }
    }
}
