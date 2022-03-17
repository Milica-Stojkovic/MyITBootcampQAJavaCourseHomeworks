package dz08122021;
//7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

import java.util.Scanner;

public class pastebin7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // unosimo mesec i godinu
        System.out.print("Unesite naziv meseca: ");
        String mesec = scanner.nextLine().toLowerCase();

        System.out.print("Unesite dan u mesecu: ");
        int dan = scanner.nextInt();

        if (dan <= 21) {
            switch (mesec) {
                case "januar":
                    System.out.print("jarac");
                    break;
                case "februar":
                    System.out.print("vodolija");
                    break;
                case "mart":
                    System.out.print("ribe");
                    break;
                case "april":
                    System.out.print("ovan");
                    break;
                case "maj":
                    System.out.print("bik");
                    break;
                case "jun":
                    System.out.print("blizanci");
                    break;
                case "jul":
                    System.out.print("rak");
                    break;
                case "avgust":
                    System.out.print("lav");
                    break;
                case "septembar":
                    System.out.print("devica");
                    break;
                case "oktobar":
                    System.out.print("vaga");
                    break;
                case "novembar":
                    System.out.print("skorpija");
                    break;
                case "decembar":
                    System.out.print("strelac");
                    break;
            }
        } else {
            switch (mesec) {
                case "januar":
                    System.out.print("vodolija");
                    break;
                case "februar":
                    System.out.print("ribe");
                    break;
                case "mart":
                    System.out.print("ovan");
                    break;
                case "april":
                    System.out.print("bik");
                    break;
                case "maj":
                    System.out.print("blizanci");
                    break;
                case "jun":
                    System.out.print("rak");
                    break;
                case "jul":
                    System.out.print("lav");
                    break;
                case "avgust":
                    System.out.print("devica");
                    break;
                case "septembar":
                    System.out.print("vaga");
                    break;
                case "oktobar":
                    System.out.print("skorpija");
                    break;
                case "novembar":
                    System.out.print("strelac");
                    break;
                case "decembar":
                    System.out.print("jarac");
                    break;
            }
        }

    }

}

