package dz21122021;

public class GlavniProgram {
    public static void main(String[] args) {

        Sportista s1 = new Sportista("Mihael Sumaher", "F1", "Ferrari", 7);
        stampajIgraca(s1);

        Sportista s2 = new Sportista("Kristijano Ronaldo", "Fudbal", "Juventus", 10);
        stampajIgraca(s2);

        s2.setKlub("Mancester Junajted");
        stampajAktuelniKlubIgraca(s2);

        Sportista s3 = new Sportista("Nikola Jokic", "Kosarka", "Denver", 8);
        stampajIgraca(s3);
        s3.setBrojDresa(17);
        stampajAktuelniDresIgraca(s3);
    }

    public static void stampajIgraca(Sportista igrac) {
        System.out.println("Igrac je: " + igrac.getImeIPrezime());
        System.out.println("sport je: " + igrac.getSport());
        System.out.println("Ime kluba je: " + igrac.getKlub());
        System.out.println("Broj dresa je: " + igrac.getBrojDresa());
        System.out.println("______________________________________");
    }
    public static void stampajAktuelniKlubIgraca(Sportista igrac) {
        System.out.println(" Aktuelni klub igraca "+ igrac.getImeIPrezime() +" je: " + igrac.getKlub());
        System.out.println("______________________________________");
    }
    public static void stampajAktuelniDresIgraca(Sportista igrac) {
        System.out.println(" Aktuelni dres igraca "+ igrac.getImeIPrezime() +" je: " + igrac.getBrojDresa());
        System.out.println("______________________________________");
    }

}
