package day05;

import java.util.Scanner;

public class M04_whileLoop {
    // indexi tek sayı olan karakterleri yazdıran bir code creat ediniz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayac = 0;
        System.out.println("Lütfen bir kelime giriniz : ");
        String kelime = scan.next();
        while (sayac <= kelime.length() - 1) {
            if (sayac % 2 == 1) {
                System.out.println(sayac + "indexteki harf:" + kelime.charAt(sayac));
            }
            sayac++;
        }


    }
}
