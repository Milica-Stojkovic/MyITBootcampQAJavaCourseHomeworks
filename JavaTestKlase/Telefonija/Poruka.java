package Telefonija;

public class Poruka extends Usluga {

    private String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    private boolean daLiJeMogucePoslatiPoruku() {
        if (super.getBrojOd() == null || super.getBrojKa() == null
        || super.getBrojOd() == super.getBrojKa()
        )

        return false;
        return false;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    @Override
    public String toString() {
        return super.getBrojOd() + "->" + super.getBrojKa() + " " + tekstPoruke;
    }

    @Override
    public Double cenaUsluge() {
        return null;
    }
   
}
