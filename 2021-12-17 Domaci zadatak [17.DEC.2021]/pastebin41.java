package dz17122021;

//41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.
public class pastebin41 {

    public static void main(String[] args) {

        double[] niz = {2, 3.4, 5.6, 7.6, 8};
        double suma = 0;
        for (int i = 0; i < niz.length; i++) {
            suma = suma + niz[i];
        }
        double prosek = racunaProsecnuVrednost(suma, niz.length);

        System.out.println("Prosecna vrednost double[] niza je " + prosek);
    }

    public static double racunaProsecnuVrednost(double suma, int duzinaNiza){
        double prosek = suma / duzinaNiza;
        return prosek;
    }

}
