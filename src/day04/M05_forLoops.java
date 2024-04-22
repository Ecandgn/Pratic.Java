package day04;

import java.util.Scanner;

public class M05_forLoops {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 10 adet sayı isteyiniz
        bu sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını bulunuz
         */
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". sayıyı giriniz: ");
            sayi = scan.nextInt();
            if (sayi >= 5 && sayi < 10) {
                continue; // bu koşul gerçekleşnce işlem yapmadan devam etmeyi sağlar
            } else {
                toplam += sayi;
            }

        }
        System.out.println("Girilen sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını : " + toplam);
    }
}
