package day03;

import java.util.Scanner;

public class M02_ternary02 {
    // Kullanicidan bir character girmesini isteyiniz
    // Character harf ise kucuk harf olup olmadigini kontrol ediniz
    // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
    // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
    // Harf degilse ekrana "Harf degil" yazdiriniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin : ");
        char karakter = scan.next().charAt(0);


        System.out.println(Character.isLetter(karakter) ? (Character.isLowerCase(karakter) ? "Kucuk Harf" : "Buyuk Harf") : "Harf degil");
    }
}
