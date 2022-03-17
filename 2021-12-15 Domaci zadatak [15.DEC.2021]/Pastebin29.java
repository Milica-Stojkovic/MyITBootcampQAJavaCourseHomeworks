package dz15122021;
//29. -//-. Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.
public class Pastebin29 {
    public static void main(String[] args) {
        int[] niz = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //primer 29
        for (int i = niz.length - 1; i >= 0; i--) {
            if (i % 3 == 0)
                System.out.println(niz[i]);
        }

        //primer 29*
        ispisiSvakiTreciElementNiza(niz);
    }

    public static void ispisiSvakiTreciElementNiza(int[] niza) {
        for (int i = niza.length - 1; i >= 0; i--) {
            if (i % 3 == 0)
                System.out.println(niza[i]);
        }
    }
}



