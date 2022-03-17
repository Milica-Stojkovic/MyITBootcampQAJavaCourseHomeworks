package dz22122021;

public class Osoba {

    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime) {
            this.ime = ime;
            this.prezime = prezime;
        }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        return sb.toString();
    }

}

