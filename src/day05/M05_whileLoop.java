package day05;

import java.util.Scanner;

public class M05_whileLoop {
    // Kullanicidan 2 sayi alaliniz.
//1. sayi taban
//2. sayi Ust
//1 sayinin ussunu hesaplatan code create edinim.
// 3, 3  sonuc = 27
//2  3 = 2*2*2=8
    public static Long usHesapla(int tabam, int us) {
        long sonuc = 1;
        while (us != 0) {
            sonuc *= tabam;
            us--;
        }
        return sonuc;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Üssünü bulmak istediğiniz sayıyı giriniz : ");
        int taban = scan.nextInt();
        System.out.println("İşlemde bulmak istefiğiniz üs sayısını giriniz : ");
        int us = scan.nextInt();
        System.out.println("Sonuc : " + usHesapla(taban, us));


        double sonuc2=Math.pow(2,0.5);
        System.out.println(sonuc2);
    }
}
