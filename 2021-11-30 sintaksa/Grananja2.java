import java.util.Scanner;

//Grananja2:Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u godini koji pocinju na to slovo(na taj glas)
// - za resavanje ovog zadatka koristiti switch
public class Grananja2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // unese mesec

        System.out.print("Unesite naziv jednog meseca u godini: ");
        String mesec = scanner.nextLine().toLowerCase();
        String ispis = " koji pocinje/u na prvo slovo unetog meseca.";

        switch (mesec) {
            case "januar":
                System.out.println("Ima 3 meseca" + ispis);
                break;
            case "februar":
                System.out.println("Ima 1 mesec" + ispis);
                break;
            case "mart":
                System.out.println("Ima 2 meseca" + ispis);
                break;
            case "april":
                System.out.println("Ima 2 meseca" + ispis);
                break;
            case "maj":
                System.out.println("Ima 2 meseca" + ispis);
                break;
            case "jun":
                System.out.println("Ima 3 meseca" + ispis);
                break;
            case "jul":
                System.out.println("Ima 3 meseca" + ispis);
                break;
            case "avgust":
                System.out.println("Ima 2 meseca" + ispis);
                break;
            case "septembar":
                System.out.println("Ima 1 mesec" + ispis);
                break;
            case "oktobar":
            System.out.println("Ima 1 mesec" + ispis);
            break;
            case "novembar":
                System.out.println("Ima 1 mesec" + ispis);
                break;
            case "decembar":
            System.out.println("Ima 1 mesec" + ispis);
            break;
        }
    }
}
