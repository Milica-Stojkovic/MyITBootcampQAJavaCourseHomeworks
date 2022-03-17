package javaTest1;
//////Napisite niz od 10 elemenata i koristeci FOR petlju pronadjite najveci broj u nizu
//        ////niz je tipa int
//        ////Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}
//        ////Primer ispisa resenja u konzoli:
//        ////Najveci broj u nizu je 43
public class Zadatak1 {

    public static void main(String[] args) {

        int[] niz = {3, 5, 4, 11, -1, 23, 5, 43, 0, 5};
        //prvi proglasavamo za max
        int max = niz[0];
        for (int i = 1; i<niz.length; i++)
        {
            //ako je sledeci veci, njega proglasavamo za max
            if (niz[i] > max)
                max = niz[i];
        }
        System.out.println("Najveci broj u nizu je " + max);
    }
}

