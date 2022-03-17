package dz27122021;

import java.util.ArrayList;

//Kreirajte array listu nekog vaseg interesovanje (npr sport)
//-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
//-iz liste dohvatite 3. element liste i ispisite
//-promenite naziv prvog elementa
//-uklonite 5. element
//-ispisite velicinu vase liste
//-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste

public class OmiljeneKnjige {

    private ArrayList<String> knjige;

    public OmiljeneKnjige(ArrayList<String> knjige) {
        this.knjige = knjige;
    }

    public ArrayList<String> getKnjige() {
        return knjige;
    }

    public void setKnjige(ArrayList<String> nizKnjiga) {
        this.knjige = nizKnjiga;
    }
    public void dodajKnjigu(String k) {
        knjige.add(k);
    }
}
