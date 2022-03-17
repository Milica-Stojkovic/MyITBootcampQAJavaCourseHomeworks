package dz24122021;
////Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.

import java.util.ArrayList;

public class TestOdeljenje {
    public static void main(String[] args) {

        Ucenik u = new Ucenik("Zoran", "Rajkovic");
        u.postaviRandomOcene(15);
        Odeljenje odeljenjeV2 = new Odeljenje("V2");

        Ucenik ucenikPera = new Ucenik("Pera", "Kostic");
        ucenikPera.postaviRandomOcene(24);
        ArrayList<Ucenik> ucenici = new ArrayList<>();
        ucenici.add(u);
        ucenici.add(ucenikPera);
        odeljenjeV2.ispisiUcenika(u);
        odeljenjeV2.setDnevnik(ucenici);

        boolean ispisanJePera = odeljenjeV2.ispisiUcenika(ucenikPera);
        if (ispisanJePera == true) {
            System.out.println("Ucenik Pera je izbrisan");
        } else
            System.out.println("Ucenik Pera nije izbrisan");
        boolean ispisanJeU = odeljenjeV2.ispisiUcenika(u);
        if (ispisanJeU == true) {
            System.out.println("Ucenik Zoran je izbrisan");
        } else
            System.out.println("Ucenik Zoran nije izbrisan");

        odeljenjeV2.upisiUcenika(ucenikPera);
        odeljenjeV2.upisiUcenika(u);

        odeljenjeV2.izlistajDnevnik();

        odeljenjeV2.prosecnaOcena(1);
        odeljenjeV2.opisnaOcena(u);
        odeljenjeV2.pogledajOcene(0);
        odeljenjeV2.prosecnaOcena(0);
        odeljenjeV2.opisnaOcena(ucenikPera);

        //Dodaje ocenu 1, kako bi pokazali da li ce se opisna ocena promeniti u Nedeovoljan
        ArrayList<Integer> perineNoveOcene = ucenikPera.getOcene();
        perineNoveOcene.add(1);
        ucenikPera.setOcene(perineNoveOcene);
        odeljenjeV2.pogledajOcene(ucenikPera);
        odeljenjeV2.opisnaOcena(ucenikPera);

        odeljenjeV2.prosecnaOcenaOdeljenja();
        odeljenjeV2.velicinaOdeljenja();

        System.out.println(odeljenjeV2);
    }
}
