package dz08122021;

//3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole. Na standardni izlaz ispisati resenje izraza:
       // 1 - 2 + 3 - .... (+/-) n.

import java.util.Scanner;

public class naizmenicnaSuma {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Unesite broj: ");
                int a = sc.nextInt();

                if (a >= 1) {
                        int rezultat = 0;
                        for (int i = 1; i <= a; i++) {

                                System.out.print(i);

                                if (i%2 == 0) {
                                        rezultat = rezultat - i;
                                        if (i!=a)
                                                System.out.print("+");
                                }
                                else {
                                        rezultat = rezultat + i;
                                       if (i!=a)
                                                System.out.print("-");
                                }

                        }
                        System.out.println();
                        System.out.println("Resenje je: " +  rezultat);
                }else {
                        System.out.println("Uneti broj nije pozitivan, unesite pozitivan broj.");
                }

        }
}
