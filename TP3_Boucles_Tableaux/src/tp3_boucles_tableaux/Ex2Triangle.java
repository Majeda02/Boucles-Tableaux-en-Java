/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_boucles_tableaux;

import java.util.Scanner;

public class Ex2Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hauteur du triangle : ");
        int h = sc.nextInt();

        if (h <= 0) {
            System.out.println("La hauteur doit être > 0");
            return;
        }

        for (int i = 1; i <= h; i++) {
            int stars = 2 * i - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

