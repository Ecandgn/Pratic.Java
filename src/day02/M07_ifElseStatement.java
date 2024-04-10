package day02;

import java.util.Scanner;

public class M07_ifElseStatement {
    public static void main(String[] args) {
          /*
        Türkiye cumhuriyetinde yaşayan birisi eğer 18 yaşında veya büyükse ve TC vatandaşı ise ehliyet alabilir
        Kullanıcıdan yaşını ve TC vatandaşı olup olmadığını sorup ehliyet alabiliyorsa yazdırın.
        Şartları taşımıyor ise alamayacağı yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı giriniz: ");
        int yas = scan.nextInt();
        System.out.println("Türkiye Cumhuriyeti vatandaşı mısınız (E/H):");
        char nationaly = scan.next().toUpperCase().charAt(0);

        if (yas >= 18 && nationaly == 'E') {
            System.out.println("Ehliyet Alabilir.");

        }else {
            System.out.println("Ehliyet Alamazsınız.Şartlardan en az birini taşımıyorsunuz");
        }
    }
}
