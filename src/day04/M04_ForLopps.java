package day04;

import java.util.Scanner;

public class M04_ForLopps {
    /*
    Girilen bir stringdeki a harfi sayısını bulunuz
    ama c harfine gelirse döngüden çıkılsın
    test data: Java Candır Gerisi heyecandır.
     */
    public static void main(String[] args) {


        String metin = "Java Candır Gerisi heyecandır.";
        int a = 0;

        for (int i = 0; i < metin.length(); i++) {
            if (metin.toLowerCase().charAt(i) == 'a') {
                a++;
            } else if (metin.toLowerCase().charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("a harfi sayısı: " + a);
    }
}
