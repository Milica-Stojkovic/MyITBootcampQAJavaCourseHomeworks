package dz08122021;

import java.util.Scanner;

//9. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
// "Buzz" ako je deljiv sa 5,
// "Zazz" ako je deljiv sa 7
// i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)
public class pastebin9 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Unesite ceo  broj n: ");
        int n = scanner.nextInt();

        if (n>=0) {
            String fizz = "Fizz";
            String buzz = "Buzz";
            String zazz = "Zazz";
            String zarez = ", ";
            for (int i = 1; i <= n; i++) {
                if (i == n) zarez = "";//da ne odstampa poslednji zarez
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        if (i % 7 == 0) {
                            //deljiv i sa 3 i sa 5 i sa 7
                            System.out.print(fizz + buzz + zazz + zarez);
                        } else {
                            //deljiv i sa 3 i sa 5
                            System.out.print(fizz + buzz + zarez);
                        }
                    }
                else {//nije deljiv sa 5
                        if (i % 7 == 0) {
                            //deljiv samo sa 3 i sa 7
                            System.out.print(fizz + zazz + zarez);
                        } else {
                            //nije deljiv ni sa 5, ni sa 7, ali jeste sa 3
                            System.out.print(fizz + zarez);
                        }
                    }
            }
                else {//nije deljiv sa 3
                    if (i % 5 == 0) {
                        if (i % 7 == 0) {
                            //samo sa 5 i sa 7
                            System.out.print(buzz + zazz + zarez);
                        } else {
                            //deljiv samo sa 5
                            System.out.print(buzz + zarez);
                        }
                    }
                    else {//nije deljiv ni sa 3 ni sa 5
                        if (i % 7 == 0) {
                            //deljiv samo sa 7
                            System.out.print(zazz + zarez);
                        } else {
                            //nije deljiv ni sa 3 ni sa 5, ni sa 7
                            System.out.print(i + zarez);
                        }
                    }
                }
            }
        } else {
            System.out.println("Uneti broj ne zadovoljava ulazni uslov.");
        }
    }
}

