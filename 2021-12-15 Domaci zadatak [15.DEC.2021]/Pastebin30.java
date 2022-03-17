package dz15122021;

//30. -//-. Izracunati proizvod elemenata tog niza.
//Primer: [2, 4] -> 8
//30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.

import java.util.Scanner;

public class Pastebin30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi broj elemenata niza n: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("unesi " + (i + 1) + ". broj: ");
            niz[i] = sc.nextInt();
        }
        //30
        int proizvod = 1;
        for (int j = 0; j < niz.length; j++) {
            proizvod = proizvod * niz[j];
        }
        System.out.println(proizvod);

        proizvod = proizvodElemenataNiza(niz);
        System.out.println("proizvod niza je: "+ proizvod);
        //30*

    }

    public static int proizvodElemenataNiza(int[] niz) {
        int proizvod = 1;
        for (int j = 0; j < niz.length; j++) {
            proizvod = proizvod * niz[j];
        }
        return proizvod;

    }
}






