package dz22122021;
//Napisati klasu Knjiga koja ima sledeca polja/atribute:
//nazivKnjige (string),
//autor (Osoba),
//vlasnik (Osoba)
//brojStrana (int),
//godinaIzdanja (int).
//Broj strana i godina izadanje ne mogu biti negativni. Ispisati poruku o gresci ako korisnik pokusa da napravi knjigu
// sa negativnim brojem strana ili godinom izdanja (u konstruktoru, jer se tamo 'pravi' knjiga).
//Takodje ispisati poruku o gresci ako korisnik pokusa da set-uje neku od ove dve vrednosti na negativno.
//Napisati sledece metode
//	2 konstruktora. Knjiga ne mora imati vlasnika -> dakle jedan konstruktor gde se salje i ko je vlasnik,
//	drugi konstruktor gde se ne salje ko je vlasnik
//	getter i setter metode za sva polja
//	toString koristeci stringBuildernepoznato
//	format
//		Naziv knjige je: <naziv knjige>
//		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
//		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
//		Broj strana: <broj strana>
//		Godina izdanja: <godina izdanja>
//	napisati i metodu "velicinaKnjige" koja vraca string
//		- "mala knjiga" - ako je broj strana od 0 do 100
//		- "srednje velika knjiga" - ako je broj strana od 101 do 300
//		- "velika knjiga" - ako je broj strana od 301-600
//		- "bas velika knjiga" - ako je broj strana 601 i vise (edited)
public class Knjiga {

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        if (brojStrana <= 0 || godinaIzdanja <= 0) {
            System.out.println("Greska! Broj strana i Godina izdanja moraju da budu veci od 0. \n");
        }
        else {
            this.nazivKnjige = nazivKnjige;
            this.autor = autor;
            this.vlasnik = null;
            this.brojStrana = brojStrana;
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        if (brojStrana <= 0 || godinaIzdanja <= 0) {
            System.out.println("Greska! Broj strana i Godina izdanja moraju da budu veci od 0. \n");
        }
        else {
            this.nazivKnjige = nazivKnjige;
            this.autor = autor;
            this.vlasnik = vlasnik;
            this.brojStrana = brojStrana;
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana <= 0) {
            System.out.println("Greska! Broj strana mora da bude veci od 0. \n");
        }
        else {
            this.brojStrana = brojStrana;
        }
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja <= 0) {
            System.out.println("Greska! Godina izdanja mora da bude veca od 0. \n");
        } else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige je: ");
        sb.append(nazivKnjige);
        sb.append("\n");
        sb.append("Autor knjige je: ");
        if (autor != null) {
            sb.append(autor);
        }
        else {
            sb.append("nepoznato");
        }
        sb.append("\n");
        sb.append("Vlasnik knjige je: ");
        if (vlasnik != null) {
            sb.append(vlasnik);
        } else {
            sb.append("knjiga nema vlasnika");
        }
        sb.append("\n");
        sb.append("Broj strana: ");
        sb.append(brojStrana);
        sb.append("\n");
        sb.append("Godina izdanja: ");
        sb.append(godinaIzdanja);
        sb.append("\n");
        sb.append("Velicina knjige: ");
        sb.append(velicinaKnjige());
        sb.append("\n");
        return sb.toString();
    }

    public String velicinaKnjige() {
        String velicina = "mala knjiga";
        if (brojStrana > 100 && brojStrana <= 300) {
            velicina = "srednje velika knjiga";
        } else if (brojStrana > 300 && brojStrana <= 600) {
            velicina = "velika knjiga";
        } else if (brojStrana > 600) {
            velicina = "bas velika knjiga";
        }
        return velicina;
    }
}

