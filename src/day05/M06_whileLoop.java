package day05;

import java.util.Scanner;

public class M06_whileLoop {
    /*
    kullanıcıdan bölünen ve bölen şeklimde 2 sayı alın ve
    bölme operatörü kullanmadan bölen işlemini gerçekleştirip bölümü hesaplayan metho create edin
     */
    static int sayac = 0;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bölünecek sayıyı giriniz : ");
        int bolunen = scan.nextInt();
        System.out.println("Bölen sayıyı giriniz : ");
        int blen = scan.nextInt();
        System.out.println("Sonuc: " + bol( bolunen,blen));
    }

    private static int bol(int bolunen, int blen) {
        while (bolunen>=blen){
            bolunen-=blen;
            sayac++;

        }
        return sayac;
    }


}

