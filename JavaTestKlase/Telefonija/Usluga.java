package Telefonija;
//Napisati apstraktnu klasu Usluga koje ima sledece atribute
//	- brojOd (Broj)
//	- brojKa (Broj)
//Napisati:
//	- konstrutor (oba polja su obavezna)
//	- polja mogu samo da se dohvate, NE mogu da se postave
//	- toString metodu, format je
//		- brojOd -> brojKa
//		npr
//		+381 63 1234567 -> +381 62 234123
//	- apstraktnu metodu cenaUsluge koja vraca vrednost tipa double

public abstract class Usluga {
    private Broj brojOd;
    private Broj brojKa;

    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;

    }

    public Broj getBrojOd() {
        return brojOd;
    }

    public void setBrojOd(Broj brojOd) {
        this.brojOd = brojOd;
    }

    public Broj getBrojKa() {
        return brojKa;
    }

    public void setBrojKa(Broj brojKa) {
        this.brojKa = brojKa;
    }

    @Override
    public String toString() {
        return  brojOd + "->" + brojKa;
    }
    public abstract Double cenaUsluge();
}
