import java.util.Scanner;

//Grananja1: Napisati program koji proverava da li je uneti broj paran. Ukoliko jeste,
// program treba da ispise poruku: Broj je paran! Ukoliko nije, program treba da ispise poruku: Broj je neparan!
public class Grananja1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // unese 1 broj

        System.out.print("Unesite broj: ");
        int a = scanner.nextInt();

        //provera da li je broj paran
        boolean paran = a % 2 == 0;
        if (paran)
        {
            System.out.println("Broj je paran!");
        }
        else
        {
            System.out.println("Broj je neparan!");
        }
    }
}
