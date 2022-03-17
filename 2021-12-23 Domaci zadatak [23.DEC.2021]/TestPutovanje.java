package dz23122021;
//Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba,
////	i onda pravi neka putovanja u neke od tih gradova, sa nekim od tih automobila i vodja puta,
////	i onda malo istestirajte i metodu za racunanje koliko je vremena potrebno da se stigne pri
////	odredjenoj brzini.
/// Destincija: Pariz, Francuska
//	Vodja puta je: Petar Petrovic
//	Putuje se automobilom: BMW, 2016, 192000
//	Udaljenost do destinacije je: 1300

import dz21122021.Automobil;
import dz22122021.Osoba;

import java.util.ArrayList;

public class TestPutovanje {
    public static void main(String[] args) {

        Grad pariz=new Grad("Pariz",6000000,"Francuska");
        Grad rim=new Grad("Rim",3000000,"Italija");
        Grad beograd=new Grad("Beograd",2000000,"Srbija");

        Automobil bmw=new Automobil("BMW","X1",234567);
        Automobil audi=new Automobil("Audi","Q4",22567);
        Automobil benz=new Automobil("Mercedes","E220",111111);
        Osoba vodja=new Osoba("Zoran","Milicevic");

        Putovanje putUPariz = new Putovanje(pariz, vodja, bmw,1900);
        System.out.println(putUPariz);
        System.out.println(putUPariz.potrebnoVreme(99.4));

        Putovanje putURim = new Putovanje(rim, audi,1000);
        ArrayList<Osoba> osobe = new ArrayList<>();
        for (int i = 1; i<6;i++)
        {
            osobe.add(new Osoba("ime"+i, "prezime"+i));
        }
        putURim.setPrijavljeneOsobe(osobe);
        System.out.println(putURim);


        Putovanje putUBeograd = new Putovanje(beograd, vodja, benz,100);
        System.out.println(putUBeograd);
        System.out.println(putUBeograd.potrebnoVreme(123.4));


    }
}
