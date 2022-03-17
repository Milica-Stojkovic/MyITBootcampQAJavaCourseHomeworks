package dz27122021;

import dz22122021.Knjiga;

import java.util.ArrayList;

public class TestOmiljeneKnjige {
    public static void main(String[] args) {
        ArrayList<String> knjige = new ArrayList<String>();
        knjige.add("Anastasija");
        knjige.add("Crveno i Crno");
        knjige.add("Kaludjer koji je prodao svoj Ferrari");
        knjige.add("Yoga za svakoga");
        knjige.add("Ana Karenjina");
        int i = 1;
        for (String knjiga : knjige) {
            System.out.println(i + ") " + knjiga);
            i++;
        }
        knjige.set(0, "Harry Potter");
        System.out.println("Prva knjiga je: " + knjige.get(0));

        System.out.println("Ovaj niz knjiga ima: " + knjige.size() + " knjiga");
        String knjigaNaPoziciji = knjige.get(2);
        System.out.println("Knjiga na poziciji br. 3 je: " + knjigaNaPoziciji);


        knjige.remove(2);
        System.out.println("ovo je novi niz niz knjiga: " + knjige);

    }
}

