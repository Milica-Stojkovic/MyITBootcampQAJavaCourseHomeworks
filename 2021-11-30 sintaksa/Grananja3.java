import java.util.Scanner;

//Grananja3: Sintaksa1 uraditi ponovo, koristeci grananja kako bismo se ogradili od nemogucih
// izracunavanja povrsina (kakvi celi brojevi moraju da budu visina, sirina i duzina?)
public class Grananja3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // unosimo 3 stranice dovoljne za izracunavanje ukupne povrsine
        System.out.print("Unesite ivicu a: ");
        int a = scanner.nextInt();
        System.out.print("Unesite ivicu b: ");
        int b = scanner.nextInt();
        System.out.print("Unesite ivicu c: ");
        int c = scanner.nextInt();

        if (a>0 && b>0 && c>0) {
            // Povrsina prostorije je jednaka zbiru povrsina pravougaonih naspravnih zidova i plafona
            // 2*(a*b) + 2*(a*c) + b*c
            int rezultat = 2 * (a * b) + 2 * (a * c) + b * c;
            System.out.println("Povrsina okrecene prostorije je: " + rezultat);
        }
        else
        {
            System.out.println("Neka od unetih vrednosti nije ispravan ceo broj. Molimo unesite za vrednosti cele brojeve vece od nule!");
        }

    }
}
