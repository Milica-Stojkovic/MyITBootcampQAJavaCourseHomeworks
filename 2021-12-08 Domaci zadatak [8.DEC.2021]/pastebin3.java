package dz08122021;
//3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

import java.util.Scanner;

public class pastebin3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite pozitivan ceo broj n: ");
        int n = sc.nextInt();
        if (n >= 1) {
            for (int i = 0; i <= n; i++) {
                System.out.print(i);
                if (i != n)
                    System.out.print(",");
            }
        } else {
            System.out.println("Uneti broj ne zadovoljava ulazni uslov.");

        }
    }
}
