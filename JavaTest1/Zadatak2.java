package javaTest1;

import java.util.Scanner;

////Napisati program koji racuna potrosnju goriva
////Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
////Motor trosi 5 litara goriva na 100 kilometara,
////Automobil trosi 7 litara na 100 kilometara,
////Kombi trosi 11 litara na 100km,
////Kamion trosi 15 litara na 100km
////Nakon sto korisnik unese tip vozila treba pokrenuti ostatak programa kroz switch
//
////Primeri ispisa u konzoli:
////Molim vas unesite tip vozila:
////Kombi
////Molim vas unesite distancu u kilometrima:
////134
////Kombi na 134.0 km potrosi 14.74 litara goriva
////Primer ispisa kad se unese pogresno vozilo
//
////Molim vas unesite tip vozila:
////Tenk
////Molim vas unesite distancu u kilometrima:
////133
////Uneli ste pogresan tip vozila
public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Molim vas unesite tip vozila(motor,automobil,kombi,kamion): ");
        String tip =sc.nextLine();
        System.out.println("Molim vas unesite distancu u kilometrima: ");
        double distanca = sc.nextDouble();
        double potrosnja = 0;

        switch(tip){
            case "motor":
                potrosnja = (distanca*5)/100;
                System.out.println("Motor na " + distanca + " km potrosi " + potrosnja + " litara goriva");
                break;
            case "automobil":
                potrosnja = (distanca*7)/100;
                System.out.println("Automobil na " + distanca + " km potrosi " + potrosnja + " litara goriva");
                break;
            case "kombi" :
                potrosnja = (distanca*11)/100;
                System.out.println("kombi na " + distanca + " km potrosi " + potrosnja + " litara goriva");
                break;
            case "kamion":
                potrosnja = (distanca*15)/100;
                System.out.println("Motor na " + distanca + " km potrosi " + potrosnja + " litara goriva");
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila");
                break;



        }

    }
}
