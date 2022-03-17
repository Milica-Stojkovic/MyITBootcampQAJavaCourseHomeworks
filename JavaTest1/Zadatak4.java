package javaTest1;

import java.util.Scanner;

////NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
////Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
////1 evro je 0,0085 dinara
////1 franak je 0,0093 dinara
////1 dolar je 0,010 dinara
////Ispise vrsiti iskljucivo iz main metode!
//
////Primeri ispisa u konzoli:
//
////Molim vas unesite iznos u dinarima:
////1200
////Molim vas da unesete valutu u koju da konvertujemo dinare:
////evro
////1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti
////Primer ispisa u konzoli kad se unese pogresna valuta
//
////Molim vas unesite iznos u dinarima:
////123
////Molim vas da unesete valutu u koju da konvertujemo dinare:
////zlato
////Niste uneli dobru valutu
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Molim vas unesite iznos u dinarima: ");
        double dinari = sc.nextDouble();

        System.out.println(" Molim vas da unesete valutu u koju da konvertujemo dinare: ");
        String valuta =sc.nextLine();



        switch (valuta) {
            case "evro":
            case "franak":
            case "dolar":

            default :
                System.out.println("Niste uneli dobru valutu");
                break;

        }



        }
        public static double konvertuj (double vrednost,double iznos){
        double konvertovano = 0;
        return konvertovano;


    }
}
