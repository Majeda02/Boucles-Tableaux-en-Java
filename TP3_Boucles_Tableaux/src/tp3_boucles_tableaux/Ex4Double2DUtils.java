/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_boucles_tableaux;

public class Ex4Double2DUtils {

    public static void affiche(double[][] t) {
        if (t == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] == null) {
                System.out.println("null");
                continue;
            }
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                if (j < t[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        if (t == null || t.length == 0) return false;
        if (t[0] == null) return false;

        int cols = t[0].length;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == null || t[i].length != cols) return false;
        }
        return true;
    }

    public static double[] sommeLignes(double[][] t) {
        if (t == null) return null;

        double[] sums = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double s = 0.0;
            if (t[i] != null) {
                for (int j = 0; j < t[i].length; j++) {
                    s += t[i][j];
                }
            }
            sums[i] = s;
        }
        return sums;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2)) return null;

        int rows = t1.length;
        int cols = t1[0].length;

        if (t2.length != rows || t2[0].length != cols) return null;

        double[][] res = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return res;
    }
}

