package dz23122021;
//Napisati klasu grad koja ima sledece polja/atribute
//	- ime(String)
//	- brojStanovnika(int)
//	- drzava(String)
//Napisati sledece metode
//	konstruktor - samo jedan, ( sva polja su obavezna)
//	getter i setter
//	toString
//		Ime grada: <ime>
//		Broj stanovnika: <brojStanovnika>
//		Drzava: <drzava>
public class Grad {
    private String imeGrada;
    private int brojStanovnika;
    private String drzava;

    public Grad(String imeGrada,int brojStanovnika,String drzava) {
        this.imeGrada = imeGrada;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
    }
        public String getImeGrada(){
            return imeGrada;
        }
        public int getBrojStanovnika(){
        return brojStanovnika;
        }
        public String getDrzava(){
            return drzava;
        }
        public void setime(String imeGrada){
        this.imeGrada =imeGrada;
        }
        public void setBrojStanovnika(int brojStanovnika){
        this.brojStanovnika=brojStanovnika;
        }
        public void setDrzava(String drzava){
        this.drzava=drzava;
        }


        public String toString() {
            String StringKojiVracam = "";
            StringKojiVracam += ("---- Grad: " + imeGrada + "\n");
            StringKojiVracam += ("---- Broj stanovnika: " + brojStanovnika + "\n");
            StringKojiVracam += ("---- Drzava: " + drzava + "\n");

            return StringKojiVracam;
        }
}


