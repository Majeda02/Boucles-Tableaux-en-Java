/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_boucles_tableaux;

import java.util.Scanner;

public class Ex6SlidingDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k < 1 || k > n || n > 100000) {
            System.out.println("Contraintes: 1 <= k <= n <= 100000");
            return;
        }

        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        final int MAXV = 100000;
        int[] freq = new int[MAXV + 1];

        int distinct = 0;

        // première fenêtre
        for (int i = 0; i < k; i++) {
            int x = T[i];
            if (x < 0 || x > MAXV) {
                System.out.println("Valeur hors bornes [0..100000] : " + x);
                return;
            }
            if (freq[x] == 0) distinct++;
            freq[x]++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(distinct);

        // glissement
        for (int i = k; i < n; i++) {
            int out = T[i - k];
            freq[out]--;
            if (freq[out] == 0) distinct--;

            int in = T[i];
            if (in < 0 || in > MAXV) {
                System.out.println("Valeur hors bornes [0..100000] : " + in);
                return;
            }
            if (freq[in] == 0) distinct++;
            freq[in]++;

            sb.append(" ").append(distinct);
        }

        System.out.println(sb);
    }
}
