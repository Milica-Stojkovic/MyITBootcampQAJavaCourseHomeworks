package dz03122021;

import java.util.Scanner;

//Faktorijel
//Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
//Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao:
// n! = n * (n-1) * (n-2) * ... * 2 * 1.
//
//Dakle, npr:
//5! = 5 * 4 * 3 * 2 * 1 = 120
//3! = 3 * 2 * 1 = 6
public class Faktorijel {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Unesite pozitivan ceo broj : ");
        int a = scanner.nextInt();

        if (a >= 1) {
            System.out.print("Faktorijel broja " + a + " je: ");
            int rezultat = 1;
            for (int i= 1; i<=a; i++){
                rezultat=rezultat*i;
            }
            System.out.print(rezultat);
        } else {
            System.out.println("Uneti broj ne zadovoljava ulazni uslov.");
        }
    }
}
