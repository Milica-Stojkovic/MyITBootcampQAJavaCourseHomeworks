package dz24122021;
////Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.

public class TestUcenik {
    public static void main(String[] args) {
        Ucenik u = new Ucenik("Petar", "Petrovic");
        u.postaviRandomOcene(9);
        System.out.println(u);
        System.out.println(String.format("%.2f", u.prosek()));
    }
}
