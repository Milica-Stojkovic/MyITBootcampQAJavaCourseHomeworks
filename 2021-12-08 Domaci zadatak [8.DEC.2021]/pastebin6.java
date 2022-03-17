package dz08122021;
//6. Ispisati proizvod prvih n celih brojeva [1, n].
// [1*2*3...*n]

import java.util.Scanner;

public class pastebin6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();

        if (n >=1) {
            int rezultat = 1;
            for (int i = 1; i <= n; i++) {
                rezultat = rezultat * i;
            };
            System.out.println("Proizvod brojeva iz skupa [1, " + n+"] je: " + rezultat);
        }
        else {
            System.out.println("Uneti broj ne zadovoljava ulazni uslov.");

        }
    }
}
