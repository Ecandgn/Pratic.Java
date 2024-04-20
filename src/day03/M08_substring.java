package day03;

import java.util.Scanner;

public class M08_substring {
    public static void main(String[] args) {
        /*kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadınızı 2 atrı kelimeye ayırınız
        ad ayrı soyad ayrı şekilde ekrana yazdırınız.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı arada bir boşluk olacak şekilde giriniz.");
        String nameSurname=scan.nextLine();
        String name=nameSurname.substring(0,nameSurname.indexOf(" ")+1);
        String surname=nameSurname.substring(nameSurname.indexOf(" "));
        System.out.println("isminiz : "+name+"\nSoy isminiz : "+surname);
    }
}
