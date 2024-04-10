package day01;

import java.util.Locale;

public class M02_dataTypes {
    public static void main(String[] args) {
        /*
        byte < short < integer < long < float < double
        doubel ve float dışındakiler sadece tam sayı alır
        sırasıyla 8bit, 16 bit, 32bit(en çok kullanılan int) ve 64 bit data saklayabilir
         */
        byte b1 = Byte.MAX_VALUE;
        System.out.println("Byte.MAX_VALUE : " + b1);
        byte b2 = Byte.MIN_VALUE;
        System.out.println("Byte.MIN_VALUE : " + b2);

        int int1 = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE : " + int1);
        int int2 = Integer.MIN_VALUE;
        System.out.println("Integer.MIN_VALUE : " + int2);

        long long1 = Long.MAX_VALUE;
        System.out.println("Long.MAX_VALUE : " + long1);
        long long2 = Long.MIN_VALUE;
        System.out.println("Long.MIN_VALUE : " + long2);

        float fl1 = Float.MAX_VALUE;
        System.out.println("Float.MAX_VALUE : " + fl1);
        float fl2 = Float.MIN_VALUE;
        System.out.println("Float.MIN_VALUE : " + fl2);

        double db1 = Double.MIN_VALUE;
        System.out.println("Double.MIN_VALUE : " + db1);

             /*
        NON Primitive data türleri
        çok fazla turu vardır
        karakter sınırı yoktur
        String bu data turunde en çok kullandığımız data türüdür.
                 */
        String isim = "tarık";
        System.out.println("isim:" + isim);
        System.out.println("İsmin ilk Harfi:" + isim.charAt(0));
        int sayi;
        sayi = 120;
        System.out.println("sayi: " + sayi);

        isim = "Murat";
        System.out.println("İsim:" + isim);
        System.out.println("isim=" + isim.toUpperCase());
        System.out.println("isim=" + isim.toLowerCase());

    }
}
