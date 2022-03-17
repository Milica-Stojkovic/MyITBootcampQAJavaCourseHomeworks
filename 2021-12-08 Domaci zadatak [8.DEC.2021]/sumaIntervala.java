package dz08122021;
//2.[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].

import java.util.Scanner;

public class sumaIntervala {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj m: ");
        int m = sc.nextInt();
        System.out.print("Unesite drugi broj n, veci ili jednak prvom broju: ");
        int n = sc.nextInt();

        if (m<=n){
            int rezultat = 0;
            //[2, 3, 4]
           // 1) rezultat = 0 + 2; -> rezultat = 2;
            //2) rezultat = 2 + 3; -> rezultat = 5;
           // 3) rezultat = 5 + 4; -> rezultat = 9;

            for (int i = m; i<=n; i++){
                rezultat = rezultat + i;
            }
            System.out.println("Suma skupa brojeva [m, n] je: " + rezultat);
            System.out.println("Program je zavrsen.");
        }
        else{
            System.out.println("Uneti brojevi ne zadovoljavaju ulazni uslov.");

        }










    }
}
