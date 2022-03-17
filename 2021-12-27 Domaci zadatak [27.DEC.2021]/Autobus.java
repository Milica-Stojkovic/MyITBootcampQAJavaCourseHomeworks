package dz27122021;

public class Autobus extends PrevoznoSredstvo {

    private int maximalanBrojPutnika;

    public Autobus(int godinaPoizvodnje, String zemljaPoizvodnje, String marka, int maximalanBrojPutnika) {
        super(godinaPoizvodnje, zemljaPoizvodnje, marka);
        this.maximalanBrojPutnika = maximalanBrojPutnika;
    }

    public int getMaximalanBrojPutnika() {
        return maximalanBrojPutnika;
    }

    public void setMaximalanBrojPutnika(int maximalanBrojPutnika) {
        this.maximalanBrojPutnika = maximalanBrojPutnika;
    }

    public void sirena() {
        System.out.println("dum dum");
    }
}