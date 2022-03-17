package dz27122021;

public class NedeljaIDani {
    public static void main(String[] args) {
        int[] dani = {1,2,3,4,5,6,7};
        int[] nedelje = {1,2,3};

        for (int i = 1; i <= nedelje.length; i++) {
            System.out.println(nedelje[i-1] + ". nedelja: ");
            for (int j = 1; j <= dani.length; j++) {
                System.out.println(dani[j-1] + ". dan ");
            }
        }
    }
}
