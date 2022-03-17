package dz03122021;

import java.util.Scanner;

//Na standardni ulaz se unose dva cela broja.
// Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku, proizvod, kolicnik
// i ostatak deljenja prvog broja drugim tim redom.
public class AritmetickeOpracije {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Unesite prvi ceo broj: ");
        int a = scanner.nextInt();

        System.out.print("Unesite drugi ceo broj: ");
        int b = scanner.nextInt();

        String border = "__________________________";
        System.out.println("**** zbir ****");
        System.out.println("**** a+b = " + a + "+" + b + " = " + (a+b) );
        System.out.println(border);
        System.out.println("**** razlika ****");
        System.out.println("**** a-b = " + a + "-" + b + " = " + (a-b) );
        System.out.println(border);
        System.out.println("**** proizvod ****");
        System.out.println("**** a*b = "  + a + "*" + b + " = " + (a*b) );
        System.out.println(border);
        System.out.println("**** kolicnik ****");
        System.out.println("**** a/b = " + a + "/" + b + " = " +  (a/b) );
        System.out.println(border);
        System.out.println("**** ostatak deljenja ****");
        System.out.println("**** a%b = " + a + "%" + b + " = " +  (a%b));
        System.out.println(border);

    }
}
