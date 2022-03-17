package dz27122021;

public class PrevoznoSredstvo {
    //Napisati klasu PrevoznoSredstvo sa sledecim atributima
    //	godinaPoizvodnje int
    //	zemljaPoizvodnje String
    //	marka string
    //Napisati klasu Automobil. Automobil je PrevoznoSredstvo koje pored atributa iz PrevoznoSredstvo ima i:
    //	tipMotora String
    //	kubikazaMotora int
    //Napisati klasu autobus. Autobus je PrevoznoSredstvo koje pored atributa iz PrevoznoSredstvo ima i:
    //	maksimalanBrojPutnika int
    //Napisati klasu voz. Voz je PrevoznoSredstvo koje pored atributa iz PrevoznoSredstvo ima i:
    //	broj vagona int
    //U svakoj klasi napisati konstruktor, getter, setter metode.
    //toString ne treba
    //U svakoj klasi napisati metodu sirena koja ispisuje:
    //	- automobil - "pip pip"
    //	- autobus - "dum dum"
    //	- voz - "cu cu"
    //	- PrevoznoSredstvo - nista
    //Napisati test program u kome je potrebno kreirati 1 automobil, voz i autobus i ispisati njihovu sirenu.
    //Nije potrebno koristiti apstraktne klase i polimorfizam, ko hoce moze(PrevoznoSredstvo apstraktna,
    // metoda sirena u PrevoznoSredstvo apstraktna) (edited)

        protected int godinaPoizvodnje;
    	protected String zemljaPoizvodnje;
    	protected String marka;

    public PrevoznoSredstvo(int godinaPoizvodnje, String zemljaPoizvodnje, String marka) {
        this.godinaPoizvodnje = godinaPoizvodnje;
        this.zemljaPoizvodnje = zemljaPoizvodnje;
        this.marka = marka;
    }

    public int getGodinaPoizvodnje() {
        return godinaPoizvodnje;
    }

    public void setGodinaPoizvodnje(int godinaPoizvodnje) {
        this.godinaPoizvodnje = godinaPoizvodnje;
    }

    public String getZemljaPoizvodnje() {
        return zemljaPoizvodnje;
    }

    public void setZemljaPoizvodnje(String zemljaPoizvodnje) {
        this.zemljaPoizvodnje = zemljaPoizvodnje;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void sirena(){
            System.out.println();
    }

}

