package javaTest1;

import java.util.Scanner;

////Napisite program koji, koristeci WHILE petlju, racuna zbir unetih brojeva (svi brojevi su tipa int),
// sve dok korisnik ne unese 0
////Primer ispisa resenja:
////Molim vas unesite 1. broj
////4
////Trenutni zbir je 4
////Molim vas unesite 2. broj
////5
////Trenutni zbir je 9
////Molim vas unesite 3. broj
////0
////Uneli ste 0 Kraj programa
public class Zadatak3 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int zbir=0;
        int x = 0;
        int i =1;
        do {
            System.out.println("Molim vas unesite " + i +".broj: ");
            x = sc.nextInt();
            zbir += x;
            if (x!=0)
                System.out.println("Trenutni Zbir je " + zbir);
            else
                System.out.println("uneli ste 0 Kraj programa");
            i++;
        }
        while (x!=0);

    }






    }

