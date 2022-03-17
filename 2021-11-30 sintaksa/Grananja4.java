import java.util.Scanner;

//Grananja4: Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana. (Vodite racuna o prestupnoj godini!)
public class Grananja4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // unosimo mesec i godinu
        System.out.print("Unesite naziv meseca: ");
        String mesec = scanner.nextLine().toLowerCase();

        System.out.print("Unesite godinu (format: GGGG): ");
        int godina = scanner.nextInt();
        int brojDana = 31;

        switch (mesec) {
            case "januar":
            case "mart":
            case "maj":
            case "jul":
            case "avgust":
            case "oktobar":
            case "decembar":
                System.out.println("Mesec ima " + brojDana + " dana."  );
                break;
            case "april":
            case "jun":
            case "septembar":
            case "novembar":
                System.out.println("Mesec ima " + brojDana-- + " dana."  );
                break;
            case "februar":
                if (godina % 4 == 0) {
                    System.out.println("Mesec ima 29 dana.");
                }
                else{
                    System.out.println("Mesec ima 29 dana.");
                }
                break;
                }
        }

    }

