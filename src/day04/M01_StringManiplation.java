package day04;

import java.util.Scanner;

public class M01_StringManiplation {
    /*
    kullanıcıdan bir kelime isteyiniz ve kelime sadece 3 harfli olmalıdır. ternary
    kullanarak harflerin unique (farklı olup olmadığına bakınız)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 3 harfli farkli bir kelime giriniz: ");
        String word = scan.next();

        char w1 = word.charAt(0);
        char w2 = word.charAt(1);
        char w3 = word.charAt(2);

        String sonuc=word.length()==3 ? (w1!=w2 && w1!=w3 && w2!=w3) ? ("Girilen 3 harfli kelime unique harflerden oluşuyor"):
                ("Girilen 3 harfli kelime unique harflerden oluşmuyor") : "Girilen kelime 3 harfli değildir.";
        System.out.println(sonuc);













    }
}
