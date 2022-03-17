package dz22122021;

//1) Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime prikazati kao dve promenljive,
// pol kao karakter, godine kao integer, vasa ocena njih od 1 do 10 (sa decimalom)
// i da li je iz Srbije odgovorite preko booleana.
// Sve potrebno za glumca i glumicu da budu dva ispisa (edited)
public class Glumac {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean izSrbije;

    public Glumac(String ime, String prezime, char pol, int godine, double ocena, boolean izSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        this.pol = pol;
        this.godine = godine;
        this.ocena = ocena;
        this.izSrbije = izSrbije;
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
        this.ime = prezime;
    }
    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public boolean getIzSrbije() {
        return izSrbije;
    }

    public void setIzSrbije(boolean izSrbije) {
        this.izSrbije = izSrbije;
    }

    public String izSrbijeDaNe() {
        String izSrb = "Ne";
        if (izSrbije)
            izSrb = "Da";
        return izSrb;
    }
}



