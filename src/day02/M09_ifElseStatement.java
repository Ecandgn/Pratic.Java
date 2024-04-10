package day02;

import java.util.Scanner;

public class M09_ifElseStatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir yıl  girmesini isteyin. Yılın artık yıl olup olmadığını kontrol edin.
        Kullanıcya da sonucu ifade edin.
        İpucu:
        Bir yılın sayısı eğer 100 ve 400 ile tam  bölünüyorsa artık yıldır
        Bir yılın sayısı eğer  100'e bölünmüyor ama 4'e tam bölünüyorsa o da artık yıldır.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yıl girin...");
        int year = scan.nextInt();
        if ((year % 100 == 0) && (year % 400 == 0)) {
            System.out.println("Artık yıldır...");
        } else if ((year % 100 != 0) && (year % 4 == 0)){
            System.out.println("Artık yıldır...");
        }else
            System.out.println("Artık yıl değildir...");


    }
}
