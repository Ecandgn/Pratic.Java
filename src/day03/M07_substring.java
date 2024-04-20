package day03;

import java.util.Scanner;

public class M07_substring {
    public static void main(String[] args) {
        //Kullanıcıdan alacağını bir string de boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir cümle Giriniz.");
        String cumle = scan.nextLine();
        if (cumle != "") {
            System.out.println(cumle.contains(" "));

        } else {
            System.out.println("Herhangi Bir değer girilmedi.");
        }
    }
}
