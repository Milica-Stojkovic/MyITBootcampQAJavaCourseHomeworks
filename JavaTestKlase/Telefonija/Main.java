import Telefonija.Broj;
import Telefonija.Korisnik;
//Napisati test program (main metodu), u kojoj je potrebno
//	- napraviti 2 broja
//	- i dva korisnika sa tim brojevima
//	- zatim korinisci jedan drugom treba da salju neke poruke i obavljaju neke pozive (min 3 poruke i 2 poziva)
//	- zatim treba ispisati oba korisnika
//	- zatim treba ispisati kolika je cena svih usluga za svakog korisnika.

public class Main {

    public static void main(String[] args) {

        Broj broj = new Broj("381", "63","1180008",false);
        Broj broj2 = new Broj ("381","11","8750506",true);
        Korisnik korisnik1 = new Korisnik("Milica","Stojkovic");
        Korisnik korisnik2 = new Korisnik("Brad","Pit");

        korisnik1.posaljiPoruku(korisnik2.getBroj(),"Gde si?");
        korisnik2.posaljiPoruku(korisnik1.getBroj(),"Evo me, cekam da zavrsis test");
        korisnik1.posaljiPoruku(korisnik2.getBroj(),"Zovem kada zavrsim!");

        korisnik1.pozovi(korisnik2.getBroj(),266);
        korisnik2.pozovi(korisnik1.getBroj(),378);

        System.out.println(korisnik1);
        System.out.println(korisnik2);

    }
}
