import java.util.Scanner;

//Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se ivice prostorije ucitavaju preko konzole.
// (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
public class Sintaksa1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // unosimo 3 stranice dovoljne za izracunavanje ukupne povrsine
        System.out.print("Unesite ivicu a: ");
        int a = scanner.nextInt();
        System.out.print("Unesite ivicu b: ");
        int b = scanner.nextInt();
        System.out.print("Unesite ivicu c: ");
        int c = scanner.nextInt();

        // Povrsina prostorije je jednaka zbiru povrsina pravougaonih naspravnih zidova i plafona
        // 2*(a*b) + 2*(a*c) + b*c
        int rezultat = 2*(a*b) + 2*(a*c) + b*c;
        System.out.println("Povrsina okrecene prostorije je: " + rezultat);

    }

}
