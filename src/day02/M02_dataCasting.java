package day02;

import java.util.Scanner;

public class M02_dataCasting {
    public static void main(String[] args) {
         /*
        2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdırın.
        ipucu: char
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf girin: ");
        char harf = scan.nextLine().charAt(0);

        System.out.println("Girdiğiniz harf: " + harf);
        System.out.println("Girdiğiniz harften sonraki  3 harf: " +
                "-" + (char) (harf + 1) +
                "-" + (char) (harf + 2) +
                "-" + (char) (harf + 3));

    }
}
