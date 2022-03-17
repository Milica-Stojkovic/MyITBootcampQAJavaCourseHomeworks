package dz08122021;
//4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

import java.util.Scanner;

public class pastebin4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite negativan ceo broj n: ");
        int n = sc.nextInt();
        if (n < 0) {
            for (int i =n; i <=0; i++) {
                System.out.print(i);
                if (i != 0)
                    System.out.print(",");
            }
        } else {
            System.out.println("Uneti broj ne zadovoljava ulazni uslov.");

        }
    }
}
