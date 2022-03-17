package dz03122021;

import java.util.Scanner;

//FizzBuzz
//Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n
// nisku "Fizz" ako je on deljiv sa 3, nisku "Buzz" ako je on deljiv sa 5, a nisku
//"FizzBuzz" ako je on deljiv i sa 3 i sa 5.
public class FizzBuzz {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Unesite celobrojni nenegativan broj n: ");
        int n = scanner.nextInt();

        if (n>=0) {
            String fizz = "Fizz";
            String buzz = "Buzz";
            String zarez = ", ";
            for (int i = 1; i <= n; i++) {
                if (i == n) zarez = "";//da ne odstampa poslednji zarez
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        //deljiv i sa 3 i sa 5
                        System.out.print(fizz + buzz + zarez);
                    } else {
                        //deljiv samo sa 3
                        System.out.print(fizz + zarez);
                    }
                } else {
                    if (i % 5 == 0) {
                        //deljiv samo sa 5
                        System.out.print(buzz + zarez);
                    }
                    else {
                        //nije deljiv ni sa 3 ni sa 5
                        System.out.print(i + zarez);
                    }
                }
            }
        } else {
            System.out.println("Uneti broj ne zadovoljava ulazni uslov.");
        }
    }
}
