package javaTest1;

import java.util.Scanner;

////NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
////Proizvoljno napravite niz od 10 brojeva
////korisnik unosi broj koji zeli da prebroji u nizu
////niz je tipa int
//
////Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
////Primeri ispisa u konzoli
//
////Unesite broj koji zelite da prbrojimo u nizu brojeva:
////2
////Broj 2 se pojavljuje 3. puta u nasem nizu brojeva
////Primer ispisa kad se unese broj koji ne postoji u nizu brojeva
//
////Unesite broj koji zelite da prbrojimo u nizu brojeva:
////8
////Broj 8 se ne pojavljuje u nasem nizu
public class Zadatak5 {
    public static void main(String[] args) {

        int[] niz = {2, 12, 432, 21, 2, 7, 12, 2, 21, -2};

        Scanner sc = new Scanner(System.in);
        System.out.println("unesite broj koji zelite da prebrojimo u nizu brojeva: ");
        int x = sc.nextInt();
        int rezultat = prebrojPonavljanjeUNizu(niz, x);
        if (rezultat > 0)
            System.out.println("Broj " + x + " se pojavljuje " + rezultat + " u nasem nizu brojeva");
        else
            System.out.println("Broj " + x + " se ne pojavljuje u nasem nizu");
    }
    public static int prebrojPonavljanjeUNizu(int[] niz,int broj){
        int brojPonavljanja = 0;
        for (int i=0;i<niz.length;i++) {
            if (niz[i] == broj) brojPonavljanja++;
        }
        return brojPonavljanja;

        }


}




