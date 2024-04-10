package day02;

public class M04_operators {
    public static void main(String[] args) {
        // = atama operatörü
        int sayi = 12;
        System.out.println(sayi);

        //== eşittir operatörü
        int a = 12;
        double b = 12.0;
        System.out.println(a == b); //true
        System.out.println((int) (b));

        //&& - & (ve) Operatörü (Tüm koşullar doğru olmalı)
        System.out.println(2 < 7 || 13 > 20); //false biri yanlış ise diğerlerini kontrol etmez
        System.out.println(2 < 7 || 13 > 20); //false biri yanlış olsa bile tüm şartları kontroleder.

        // || (Veya) operatörü (Koşullardan bir tanesi doğru ise doğrudur.)
        System.out.println(2 < 7 || 13 > 20); //true

        // % Modules operatörü (bölüm sonucu kalan değeri verir)
        System.out.println(14 % 3);

    }
}
