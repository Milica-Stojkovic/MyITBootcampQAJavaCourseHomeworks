package dz22122021;

public class TestKnjiga {
    public static void main(String[] args) {
        Knjiga k1 = new Knjiga("Ana Karenjina", new Osoba("Lav", " Nikolajevic Tolstoj"), new Osoba("Konstantin", "Stojkovic"),
                578, 2005);
        System.out.println(k1);
        k1.setBrojStrana(0);
        k1.setGodinaIzdanja(0);

        Knjiga k2 = new Knjiga("Ana Karenjina II", new Osoba("Lav", " Nikolajevic Tolstoj"),
                8, 2008);
        System.out.println(k2);

        Knjiga k3 = new Knjiga("Ana Karenjina III", null,777, 2008);
        System.out.println(k3);

        Knjiga k4 = new Knjiga("Ana Karenjina IV", null,0, 2008);
        if (k4.getNazivKnjige()!=null)
            System.out.println(k4);

        Knjiga k5 = new Knjiga("Ana Karenjina V", null,55, 0);
        if (k5.getNazivKnjige()!=null)
            System.out.println(k5);
    }
}
