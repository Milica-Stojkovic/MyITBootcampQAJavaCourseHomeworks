package dz17122021;

//42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
public class pastebin42 {

    public static void main(String[] args) {

        String[] niz = {"Ana", "Ivana", "Marija", "Zoran", "Petar"};
        if (niskaImena(niz)) {
            System.out.println("da,postoji.");
        } else
            System.out.println("ne,ne postoji.");

    }
    public static boolean niskaImena(String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] == "Marija" || niz[i] == "Petar") {
                return true;
            }
        }
        return false;
    }
}


