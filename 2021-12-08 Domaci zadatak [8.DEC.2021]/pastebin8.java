package dz08122021;
//8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
//	"Dobrodosao u {x}. razred, {ime} {prezime}",
//	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak
//	ispisati jednu odgovarajucu
//    poruku od:
//	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

import java.util.Scanner;

public class pastebin8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String i = sc.nextLine();
        System.out.print("Unesite prezime: ");
        String p = sc.nextLine();
        System.out.print("Unesite godinu rodjenja (gggg): ");
        int g = sc.nextInt();
        String imeprezime =  i + " " + p;
        if (g <= 2021) {
            int starost = 2021 - g;
            // od 7 - 19 godina ispisujemo poruku o dobrodoslici u razred
            if (starost >7 && starost <=19)
            {
                //odredjujemo koji je razred
                int x = starost -7;
                System.out.println("Dobrodosao u " + x + ". razred" + ", " + imeprezime);
            }
            else if (starost <= 7){
                System.out.println(imeprezime +" tek treba da zapocne obrazovanje");
            }
            else{
                System.out.println(imeprezime + " je zavrsio skolu");
            }

        } else {
            System.out.println(imeprezime + " nije jos uvek rodjen/a");
        }
    }
}

