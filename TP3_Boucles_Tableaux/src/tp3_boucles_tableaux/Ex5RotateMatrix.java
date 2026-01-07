/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_boucles_tableaux;

import java.util.Scanner;

public class Ex5RotateMatrix {

    public static void rotate90ClockwiseInPlace(int[][] A) {
        int n = A.length;

        // Transposition
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }

        // Renverser chaque ligne
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = tmp;
            }
        }
    }

    public static void rotate90CounterClockwiseInPlace(int[][] A) {
        int n = A.length;

        // Transposition
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }

        // Renverser chaque colonne
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n / 2; i++) {
                int tmp = A[i][j];
                A[i][j] = A[n - 1 - i][j];
                A[n - 1 - i][j] = tmp;
            }
        }
    }

    public static void rotate180InPlace(int[][] A) {
        int n = A.length;
        // 180° = renverser lignes + renverser ordre des lignes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = tmp;
            }
        }
        for (int i = 0; i < n / 2; i++) {
            int[] tmpRow = A[i];
            A[i] = A[n - 1 - i];
            A[n - 1 - i] = tmpRow;
        }
    }

    public static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]);
                if (j < A[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 2 || n > 200) {
            System.out.println("N doit être dans [2..200]");
            return;
        }

        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        rotate90ClockwiseInPlace(A);
        printMatrix(A);
    }
}
