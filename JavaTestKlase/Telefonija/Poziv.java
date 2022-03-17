package Telefonija;

public class Poziv extends Usluga {
    private int trajanje;

    public Poziv(Broj BrojOd, Broj BrojKa, int trajanje) {
        super(BrojOd, BrojKa);
        this.trajanje = trajanje;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    @Override
    public Double cenaUsluge() {
        if (daLiJeMoguceObavitiPoziv()) {
            double minuti = trajanje / 60;
            if (minuti - (minuti % 1) > 0)
                return 10 * (Math.floor(minuti) + 1);
            else
                return 10 * Math.floor(minuti);
        }
        else
            return 0.0;
    }
    private Boolean daLiJeMoguceObavitiPoziv(){
        if( super.getBrojOd()==null || super.getBrojKa()==null
                || super.getBrojOd()==super.getBrojKa())
            return false;
        return true;
    }

    @Override
    public String toString() {
        {
            return super.getBrojOd() + "->" + super.getBrojOd() + " " + trajanje;
        }
    }

}
