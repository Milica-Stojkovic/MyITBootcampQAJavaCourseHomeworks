package dz27122021;

public class Voz extends PrevoznoSredstvo{
    private int brojVagona;

    public Voz(int godinaPoizvodnje, String zemljaPoizvodnje, String marka, int brojVagona) {
        super(godinaPoizvodnje, zemljaPoizvodnje, marka);
        this.brojVagona = brojVagona;
    }

    public int getBrojVagona() {
        return brojVagona;
    }

    public void setBrojVagona(int brojVagona) {
        this.brojVagona = brojVagona;
    }
    public void sirena(){
        System.out.println("cu cu");
    }
}
