package dz24122021;
//9.
//Napisati klasu Ucenik koja ima sledeca polja:
//	- String ime
//	- String prezime
//	- ArrayList ocene
//
//Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime,
// a ocene postavlja na praznu listu.
//Napisati gettere i settere za sva polja.
//Napisati toString() metod:
//	{ime} i {prezime} ima ocene:
//	{ocene}
//Napisati metod prosek koji racuna prosek Ucenika.

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer>ocene;

    public Ucenik(String ime,String prezime, ArrayList<Integer> ocene){
        this.ime=ime;
        this.prezime=prezime;
        this.ocene=ocene;

    }
    public Ucenik(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
        this.ocene=null;
    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public void setIme(String ime){
        this.ime=ime;

    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(" ima ocene: ");
        sb.append(ocene);

        return sb.toString();
    }
    //Napisati metod prosek koji racuna prosek Ucenika.
    public double prosek(){
        double prosek=0;
        double suma=0;
        if(ocene != null && ocene.size()>0){
            for(int ocena : ocene){
                suma=suma+ocena;
            }
            prosek=suma/ocene.size();
        }
        return prosek;
    }

    //Metod koji postavlja n random ocena uceniku
    public void postaviRandomOcene(int n){
        ArrayList<Integer> ocene = new ArrayList<>();
        for (int i = 0; i<n; i++)
        {
            if (i%6==0) {
                ocene.add(2);
                continue;
            }
            if (i%2==0) {
                ocene.add(3);
                continue;
            }
            else if (i%3==0) {
                ocene.add(4);
                continue;
            }
            else
                ocene.add(5);
        }
        this.ocene = ocene;
    }
}
