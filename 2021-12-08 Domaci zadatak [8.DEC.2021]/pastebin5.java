package dz08122021;
//5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

import java.util.Scanner;

public class pastebin5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite pozitivan ceo broj n: ");
        int n = sc.nextInt();
        if (n>=1) {
            for (int i =-14; i <=2*n; i++) {
                System.out.print(i);
                if (i != 2*n)
                    System.out.print(",");
            }
        } else {
            System.out.println("Uneti broj ne zadovoljava ulazni uslov.");

        }
    }
}
