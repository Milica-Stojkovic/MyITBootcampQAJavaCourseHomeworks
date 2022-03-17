package dz27122021;

public class Automobil extends PrevoznoSredstvo {
    private String tipMotora;
    private int kubikazaMotora;

    public Automobil(int godinaPoizvodnje, String zemljaPoizvodnje, String marka, String tipMotora, int kubikazaMotora) {
        super(godinaPoizvodnje, zemljaPoizvodnje, marka);
        this.tipMotora = tipMotora;
        this.kubikazaMotora = kubikazaMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public int getKubikazaMotora() {
        return kubikazaMotora;
    }

    public void setKubikazaMotora(int kubikazaMotora) {
        this.kubikazaMotora = kubikazaMotora;
    }
    public void sirena(){
        System.out.println("pip pip");
    }
}
