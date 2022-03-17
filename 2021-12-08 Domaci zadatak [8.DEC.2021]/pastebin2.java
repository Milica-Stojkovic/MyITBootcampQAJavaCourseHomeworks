package dz08122021;
//2. Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0,
// "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0.

import java.util.Scanner;

public class pastebin2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Negativan");
        }
        else if(n==0){
            System.out.println("Neutralan");
        }
        else {
            System.out.println("Pozitivan");
        }
    }
}
