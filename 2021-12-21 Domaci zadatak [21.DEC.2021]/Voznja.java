package dz21122021;

import java.util.Scanner;

public class Voznja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Prvi auto ");
        System.out.print("Unesite marku prvog auta: ");
        String marka = sc.next();
        System.out.print("Unesite model prvog auta: ");
        String model = sc.next();
        System.out.print("Unesite serijskiBroj prvog auta: ");
        int serijskiBroj = sc.nextInt();
        System.out.print("Unesite vlasnika prvog auta: ");
        String vlasnik = sc.next();


        Automobil a1= new Automobil(marka, model,serijskiBroj,vlasnik);
        stampajAuto(a1);

        a1.setVlasnik("Zoran Petrovic");
        System.out.println("Drugi vlasnik prvog auta je: " + a1.getVlasnik());

        stampajAuto(a1);

        System.out.println("Drugi auto ");

        Automobil a2 = new Automobil("renault","clio", 2019456,"Ivan Ivanovic");
        stampajAuto(a2);

        System.out.println("Treci auto ");
        Automobil a3 = new Automobil("audi","a3", 2056666,"Milica Ivanovic");
        stampajAuto(a3);
    }

    public static void stampajAuto(Automobil auto){
        System.out.println("Marka je: " + auto.getMarka());
        System.out.println("Model je: " + auto.getModel());
        System.out.println("Serijski Broj je: " + auto.getSerijskiBroj());
        System.out.println("Vlasnik je: " + auto.getVlasnik());
    }
}
