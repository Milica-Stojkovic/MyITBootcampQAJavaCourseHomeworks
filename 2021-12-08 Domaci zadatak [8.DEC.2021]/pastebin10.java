package dz08122021;

//10. Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
// koji je strogo manji od njega (dakle t < n),
// sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).
// [Ovaj zadatak je dosta komplikovan!]

import java.util.Scanner;

public class pastebin10 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Unesite pozitivan ceo broj n: ");
                int n = sc.nextInt();

                if (n >= 1) {
                        int rezultat;
                        //za svaki t
                        for (int t = 1; t < n; t++) {
                                rezultat = 0;
                                //racunamo sumu od 1 do t
                                for (int i = 1; i<=t; i++) {
                                        rezultat = rezultat + i;
                                }
                                System.out.println("za broj t = " + t + ", suma je: " + rezultat);
                       }

                }else {
                        System.out.println("Uneti broj nije pozitivan, unesite pozitivan broj.");
                }

        }
}
