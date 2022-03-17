package dz08122021;

import java.util.Scanner;

public class duplifaktorijel {
    public static void main(String[] args) {

        //1.[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetog broja n. Dupli faktorijel broja n je:
        //n!! = n * (n-2) * (n-4) * ... * (2 ili 1)
// 5!! = 5*3*1
// 6!! = 6 * 4 * 2

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite pozitivan ceo broj: ");
        int n = sc.nextInt();


        if (n >= 1) {
            //setujemo pocetnu vrednost
            int rezultat = 1;
            if (n%2==0)
                rezultat = 2;

            System.out.print("Dupli faktorijel unetog broja " + n + " je: ");

            for (int i = rezultat; i <= n; i = i+2) {
                //preskocimo prvi za parne
                if (n % 2 == 0 && i == rezultat) {
                    continue;
                }
                rezultat = rezultat * i;
            }
            System.out.print(rezultat);
        } else {
            System.out.println("Uneti broj nije pozitivan, unesite pozitivan broj.");
        }

    }

}



