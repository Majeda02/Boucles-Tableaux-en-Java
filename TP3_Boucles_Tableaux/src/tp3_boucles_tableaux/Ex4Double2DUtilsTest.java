/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3_boucles_tableaux;

public class Ex4Double2DUtilsTest {
    public static void main(String[] args) {

        double[][] t1 = {
                {1.5, 2.0, 3.0},
                {4.0, 5.5, 6.0}
        };

        double[][] t2 = {
                {10.0, 20.0, 30.0},
                {40.0, 50.0, 60.0}
        };

        System.out.println("Affiche t1 :");
        Ex4Double2DUtils.affiche(t1);

        System.out.println("\nRegulier t1 ? " + Ex4Double2DUtils.regulier(t1));

        System.out.println("\nSomme des lignes t1 :");
        double[] sums = Ex4Double2DUtils.sommeLignes(t1);
        for (int i = 0; i < sums.length; i++) {
            System.out.println("Ligne " + i + " -> " + sums[i]);
        }

        System.out.println("\nSomme t1 + t2 :");
        double[][] s = Ex4Double2DUtils.somme(t1, t2);
        if (s == null) {
            System.out.println("Impossible (dimensions différentes ou tableau non régulier)");
        } else {
            Ex4Double2DUtils.affiche(s);
        }
    }
}
