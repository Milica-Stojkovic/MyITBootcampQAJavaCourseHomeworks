package Telefonija;
//	- konstruktor(ime prezime broj polja obavezna, niz inicijalno prazan)
//	- getter i setter metode (istorijaUsluga nije moguce set-ovati, samo getovati)
//	- toString metodu, format je
//		ime prezime broj
//		Istorija usluga:
//		<usluga>
//		<usluga>

import java.util.ArrayList;
import java.util.Random;

public class Korisnik {
    private int id;
    private String ime;
    private String prezime;
    private Broj broj;
    private ArrayList<Usluga>istorijaUsluga;

    public Korisnik(String ime, String prezime) {
        this.id = new Random().nextInt();
        this.ime = ime;
        this.prezime = prezime;
        this.broj = broj;
        this.istorijaUsluga = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Broj getBroj() {
        return broj;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }

    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" ");
        sb.append(broj);
        sb.append("\nIstorija usluga: ");
        if (istorijaUsluga.size ()>0)
            for (Usluga usluga : istorijaUsluga)
            {
                sb.append(usluga);
                sb.append("\n");

    }
    else
        sb.append("Trenutno nema usluga\n");
    return sb.toString();

    }
    public void posaljiPoruku (Broj brojKa,String tekstPoruke){
        Poruka poruka =new Poruka (broj, brojKa, tekstPoruke);
        if (istorijaUsluga==null)
            istorijaUsluga = new ArrayList<>();
        istorijaUsluga.add(poruka);

    }
    public void pozovi (Broj brojKa,int trajanjeUSekundama){
        Poziv poziv =new Poziv (broj, brojKa, trajanjeUSekundama);
        if (istorijaUsluga==null)
            istorijaUsluga = new ArrayList<>();
        istorijaUsluga.add(poziv);

    }
    public double cenaSvihUsluga(){
       double cena = 0.0;
       for(Usluga usluga : istorijaUsluga)
           cena += usluga.cenaUsluge();
       return cena;
    }
}
