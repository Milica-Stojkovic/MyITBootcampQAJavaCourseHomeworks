package dz15122021;//package dz15122021;

import java.util.Scanner;

//28. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
//Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
//28* Napraviti funkciju koja vraca sumu prosledjenog niza.
public class Pastebin28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("unesi broj elemenata niza n: ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("unesi " + (i + 1) + ". broj: ");
            niz[i] = sc.nextInt();
        }
        //28
        int suma = 0;
        for (int j = 0; j < niz.length; j++) {
            suma = suma + niz[j];
        }
        System.out.print("Suma elemenata niza je: ");
        System.out.println(suma);

        //28*
        suma = sumaNiza(niz);
        System.out.print("* Suma elemenata niza je: ");
        System.out.println(suma);

    }

    public static int sumaNiza(int[] niz) {
        int suma = 0;
        for (int j = 0; j < niz.length; j++) {
            suma = suma + niz[j];
        }
        return suma;
    }
}
