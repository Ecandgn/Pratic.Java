package day02;

import java.util.Scanner;

public class M01_dataCasting {
    public static void main(String[] args) {
        /*
        1- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu tam sayı olarak yazdırın
        ipucu: sorumluluk bende
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Ondalıklı İki Tam Sayı Girin: ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("Bölme işlemi sonucu: "+(int) (sayi1/sayi2));
    }
}
