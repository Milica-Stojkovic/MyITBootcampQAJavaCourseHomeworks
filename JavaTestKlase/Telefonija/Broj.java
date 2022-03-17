package Telefonija;
//Napisati klasu Broj koja ima sledece atribute:
//	- tekstualni kod drzave (npr 381 je za srbiju) (String)
//	- pozivni broj (npr 63) (String)
//	- broj (npr 1234567) (String)
//	- fiksniBroj (boolean) - ima vrednost true ako je broj fiksni, a false ako je broj mobilni
//Napisati:
//	- konstruktor (sva polja su obavezna)
//	- getter i setter metode
//	- napisati toString metodu, format je:
//		+kodDrzave pozivniBroj broj
//		na primer
//		+381 63 1234567
public class Broj {

    private String kodDrzave;
    private String pozivniBroj;
    private String broj;
    private boolean fiksniBroj;

    public Broj(String kodDrzave, String pozivniBroj, String broj, boolean fiksniBroj) {
        try {
            if (proveriDaLiStringSadrziSamoNumerike(kodDrzave))
                throw new ArithmeticException("Pogresan unos: ");
            this.kodDrzave = kodDrzave;
            this.pozivniBroj = pozivniBroj;
            this.broj = broj;
            this.fiksniBroj = fiksniBroj;
        }
        catch (ArithmeticException ex){
            System.out.println("Greska! Pogresan unos:" +ex.getMessage());

        }
    }
    public String getKodDrzave() {
        return kodDrzave;
    }
    public void setKodDrzave(String kodDrzave) {
        try {
            if (proveriBroj(kodDrzave,this.pozivniBroj,this.broj))
                this.kodDrzave = kodDrzave;
        }
        catch (ArithmeticException ex){
            System.out.println("Greska!Pogresan unos:" +ex.getMessage());
        }

        this.kodDrzave = kodDrzave;
    }
    public String getPozivniBroj() {
        return pozivniBroj;
    }
    public void setPozivniBroj(String pozivniBroj) {
        try {
            if (proveriBroj(this.kodDrzave, pozivniBroj, this.broj))
                this.pozivniBroj = pozivniBroj;
        } catch (ArithmeticException ex) {
            System.out.println("Greska!Pogresan unos:" + ex.getMessage());
        }

    }
    public String getBroj() {
        return broj;

    }
    public void setBroj(String broj) {
        try {
            if (proveriBroj(this.kodDrzave, this.pozivniBroj, broj))
                this.broj = broj;
        } catch (ArithmeticException ex) {
            System.out.println("Greska!Pogresan unos:" + ex.getMessage());
        }
    }
        public Boolean getFiksniBroj() {
            return fiksniBroj;
        }

    public void setFiksniBroj(boolean fiksniBroj) {
        this.fiksniBroj = fiksniBroj;

    }
    @Override
    public String toString() {
        return "+"+kodDrzave+" "+pozivniBroj+" "+broj;

    }
    private static boolean proveriDaLiStringSadrziSamoNumerike(String samoBrojevi){
        for (int i=0; i <= samoBrojevi.length(); i++){
            if (Character.isDigit(samoBrojevi.charAt(i)));
                return false;
        }
        return true;
    }
    private static boolean proveriBroj(String kodDrzave, String pozivniBroj,String broj){
        if (kodDrzave == null || kodDrzave.length()!=3 || !proveriDaLiStringSadrziSamoNumerike(kodDrzave))
            throw new ArithmeticException ("Kod drzave nevalidan!");
        if (pozivniBroj == null || pozivniBroj.length()!=2 || !proveriDaLiStringSadrziSamoNumerike(pozivniBroj))
            throw new ArithmeticException ("Pozivni broj nevalidan!");
        if (broj == null || broj.length() ==7 || broj.length() ==8 || !proveriDaLiStringSadrziSamoNumerike(broj))
            throw new ArithmeticException ("Broj nevalidan!");

        return true;
    }

}
