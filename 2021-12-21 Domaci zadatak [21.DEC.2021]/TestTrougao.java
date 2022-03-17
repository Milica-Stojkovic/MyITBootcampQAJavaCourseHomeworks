package Klase1;

import java.util.Scanner;

public class TestTrougao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite stranicu a: ");
        double a = sc.nextDouble();
        System.out.println("Unesite stranicu b: ");
        double b = sc.nextDouble();
        System.out.println("Unesite stranicu c: ");
        double c = sc.nextDouble();

        Trougao tr1 = new Trougao(a,b,c);
        System.out.println("Obim trougla je: "+ tr1.obim() );
        System.out.println("Povrsina trougla je: " + tr1.povrsina());

    }
}
