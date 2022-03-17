package dz23122021;

import dz21122021.Automobil;
import dz22122021.Osoba;

import java.util.ArrayList;


//Napisati klasu Putovanje koja ima sledeca polja/atribute:
//	- destinacija(Grad)
//	- vodjaPuta (Osoba)
//	- vozilo (Automobil) - ovo polje se odnosi na automobil kojim se ide na putovanje
//	- udaljenostUKm (double)
//udaljenostUKm ne sme biti negativna. Ispisati poruku o gresci ako korisnik pokusa da napravi
// Putovanje sa negativnom udaljenoscu.
//Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje udaljenostUKm na negativno.
//Napisati sledece metode:
//	2 konstruktora -> vodja puta ne mora da postoji
//	gettere settere
//	toString metodu koristeci stringBuilder
//	format
//	Destincija: <ImeGrada, ImeDrzave>
//	Vodja puta je: <ime i prezime vodje puta ako postoji, 'putovanje nema vodju puta'
//	ako vodja puta nije postavljen (null)>
//	Putuje se automobilom: <marka, godinaProizvodnje, kilometraza>
//	Udaljenost do destinacije u kilometrima je: <udaljenostUKm>
//	primer
//	Destincija: Pariz, Francuska
//	Vodja puta je: Petar Petrovic
//	Putuje se automobilom: BMW, 2016, 192000
//	Udaljenost do destinacije je: 1300
//	c
//	Napisati i test program koji pravi nekoliko gradova i nekoliko automobila i nekoliko osoba,
//	i onda pravi neka putovanja u neke od tih gradova, sa nekim od tih automobila i vodja puta,
//	i onda malo istestirajte i metodu za racunanje koliko je vremena potrebno da se stigne pri
//	odredjenoj brzini.
//da ukljUcuje i polje za niz prijavljenih osoba koje idu na to putovanje
public class Putovanje {
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe;

    public Putovanje(Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm){
        if(udaljenostUKm<0){
            System.out.println("Greska! Udaljenost ne sme biti negativna.");
        }
        else {
            this.destinacija = destinacija;
            this.vodjaPuta = vodjaPuta;
            this.vozilo = vozilo;
            this.udaljenostUKm = udaljenostUKm;
        }
    }
    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm){
        if(udaljenostUKm<0){
            System.out.println("Greska! Udaljenost ne sme biti negativna.");
        }
        else {
            this.destinacija = destinacija;
            this.vodjaPuta = null;
            this.vozilo = vozilo;
            this.udaljenostUKm = udaljenostUKm;
        }
    }

    public Grad getDestinacija(){
        return destinacija;
    }

    public Automobil getVozilo() {
        return vozilo;
    }
    public Osoba getVodjaPuta(){
        return vodjaPuta;
    }
    public double getUdaljenostKm(){
        return  udaljenostUKm;
    }
    public void setDestinacija(Grad destinacija){
        this.destinacija=destinacija;
    }
    public void setVodjaPuta(Osoba vodjaPuta){
        this.vodjaPuta=vodjaPuta;
    }
    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe){
        this.prijavljeneOsobe = prijavljeneOsobe;
    }
    public  void setUdaljenostKm(double udaljenostKm){
        if(udaljenostKm<0){
            System.out.println("Greska! Udaljenost ne sme biti negativna.");
        }
        else {
            this.udaljenostUKm = udaljenostKm;
        }
    }

    public void setVozilo(Automobil vozilo){
        this.vozilo=vozilo;
    }

    //privatna da bi mogla samo interno u klasi da se koristi, a spolja ne vidi
    private double vremeDaSeStigne(double brzina){
        //brzina je rastojanje kroz vreme
        return udaljenostUKm/brzina;
    }

    //public - interno koristi vremeDaSeStigne, i priprema ceo string za stampu teksta
    //o potrebnom vremenu da bi se stiglo na destinaciju
    //Formatira double brzinu u string koristeci samo 2 decimale
    public String potrebnoVreme(double brzina) {
        double potrebnoVremena = vremeDaSeStigne(brzina);
        StringBuilder sb=new StringBuilder();
        sb.append("Da bi se stiglo do grada ");
        sb.append(destinacija.getImeGrada());
        sb.append(" brzinom od ");
        sb.append(brzina);
        sb.append("km/h, potrebno je ");
        sb.append(String.format("%.2f", potrebnoVremena));
        sb.append(" sati \n");
        sb.append("________________________________");
        return sb.toString();
    }

    public  String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Destinacija: ");
        sb.append("\n");
        sb.append(destinacija);
        sb.append("\n");
        sb.append("Vodja puta je: ");
        if(vodjaPuta==null) {
            sb.append("vodja puta ne postoji.");
        }
        else {
            sb.append(vodjaPuta);
        }
        sb.append("\n");
        sb.append("Putuje se automobilom: ");
        sb.append("\n");
        sb.append(vozilo);
        sb.append("\n");
        sb.append("Udaljenost do destinacije je: ");
        sb.append(udaljenostUKm);
        sb.append("km \n");
        sb.append("________________________________");
        if(prijavljeneOsobe!= null) {
            sb.append("\n");
            sb.append("Prijavljene osobe: ");
            sb.append("\n");
            int i=1;
            for (Osoba osoba : prijavljeneOsobe) {
                sb.append(i);
                sb.append(". ");
                sb.append(osoba);
                sb.append("\n");
                i++;
            }
            sb.append("________________________________");
        }

        return sb.toString();
     }
}









