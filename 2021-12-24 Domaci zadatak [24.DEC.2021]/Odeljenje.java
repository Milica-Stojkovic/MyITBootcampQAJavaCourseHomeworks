package dz24122021;
import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = null;
    }

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    //Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    public void upisiUcenika(Ucenik u) {
        if (dnevnik != null)
            dnevnik.add(u);
    }

    //Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
    public void upisiUcenika(Ucenik u, int redniBroj) {
        if (dnevnik != null)
            dnevnik.add(redniBroj, u);
    }

    //Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    public boolean ispisiUcenika(Ucenik u) {
        if (dnevnik != null)
            return dnevnik.remove(u);

        return false;
    }

    //Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
    public Ucenik ispisiUcenika(int i) {
        if (dnevnik != null)
            return dnevnik.remove(i);
        return null;
    }

    //Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
    public void pogledajOcene(Ucenik u) {
        ArrayList<Integer> ocene = u.getOcene();
        int i = 0;
        if (ocene != null && ocene.size() > 0) {
            for (int ocena : ocene) {
                System.out.print(ocena);
                if (i < ocene.size() - 1)
                    System.out.print(", ");
                i++;
            }
            System.out.println();
        }
    }

    //Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    public void pogledajOcene(int i) {
        if (dnevnik != null && dnevnik.size() >= i) {
            Ucenik ucenik = dnevnik.get(i);
            pogledajOcene(ucenik);
        }
    }

    //Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
    public void prosecnaOcena(Ucenik u) {
        System.out.println("Prosecna ocena ucenika " + u.getIme() + " " + u.getPrezime() + " je: " + String.format("%.2f", u.prosek()));
    }

    //Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public void prosecnaOcena(int i) {
        if (dnevnik != null && dnevnik.size() >= i) {
            Ucenik ucenik = dnevnik.get(i);
            prosecnaOcena(ucenik);
        }
    }

    //Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
    public void prosecnaOcenaOdeljenja() {
        double prosek = 0;
        if (dnevnik != null && dnevnik.size() > 0) {
            for (Ucenik ucenik : dnevnik) {
                prosek += ucenik.prosek();
            }
            prosek = prosek/dnevnik.size();
        }
        System.out.println("Prosecna ocena odeljenja " + oznaka + " je: " + String.format("%.2f", prosek));
    }

    //Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
//	- "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
//	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
//	- "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
//	- "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
//	- "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu
    public void opisnaOcena(Ucenik u) {
        double prosek = u.prosek();
        ArrayList<Integer> ocene = u.getOcene();
        if (prosek == 0) {
            System.out.println("Neocenjen");
            return;
        }
        else if (ucenikImaJedinicu(ocene)){
            System.out.println("Nedovoljan");
            return;
        }
        else if (prosek >= 4.5)
            System.out.println("Odlican");
        else if (prosek >= 3.5 && prosek < 4.5)
            System.out.println("Vrlo dobar");
        else if (prosek >= 2.5 && prosek < 3.5)
            System.out.println("Dobar");
        else if (prosek >= 1.5 && prosek < 2.5)
            System.out.println("Dovoljan");
    }

    private boolean ucenikImaJedinicu(ArrayList<Integer> ocene) {
        if (ocene != null && ocene.size() > 0) {
            for (int ocena : ocene)
                if (ocena == 1)
                    return true;
        }
        return false;
    }

    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //za sve ucenike.
    public void izlistajDnevnik() {
        if (dnevnik != null && dnevnik.size() > 0) {
            for (Ucenik ucenik : dnevnik) {
                System.out.println(ucenik);
            }
        }
    }


    //Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
    //	- "Veliko odeljenje"; ako ima vise od 25 ucenika
    //	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
    //	- "Malo odeljenje"; ako ima ucenika manje od 15
    public void velicinaOdeljenja() {
        if (dnevnik != null && dnevnik.size() > 0) {
            int valicinaOdeljenja = dnevnik.size();
            if (valicinaOdeljenja > 25)
                System.out.println("Veliko odeljenje");
            else if (valicinaOdeljenja >= 15 && valicinaOdeljenja <=25)
                System.out.println("Srednje odeljenje");
            else if (valicinaOdeljenja < 15)
                System.out.println("Malo odeljenje");
        }
    }
//Napisati toString() metod:
//	{Oznaka} odeljenja ima djake:
//	{Ime1} {Prezime1}
//	{Ime2} {Prezime2}
//	...
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenje ");
        if (dnevnik != null && dnevnik.size() > 0) {
            sb.append("ima djake:");
            for (Ucenik ucenik : dnevnik) {
                sb.append("\n");
                sb.append(ucenik.getIme());
                sb.append(" ");
                sb.append(ucenik.getPrezime());
            }
        }
        else
            sb.append("nema jos uvek djaka!");

        return sb.toString();
    }
}

