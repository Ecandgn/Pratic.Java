package day04;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class M02_StringManiplation {
    public static void main(String[] args) {
         /*

       * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
       * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
       * input : John White 1234234534561478
         output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
       */

 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
 1) \\d    ==> tum rakamlar         0->9
     \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
 2) \\w   ==> A->Z     a->z
     \\W  ==> A->Z    a->z      tum harf disi character ler
 3) \\s   ==> space
     \\S   ==> space disindaki hersey
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz : ");
        String name = scan.nextLine();
        System.out.println("Soyisminizi giriniz : ");
        String surname = scan.nextLine();
        System.out.println("16 haneli kredi kartı nuaranızı giriniz : ");
        String credicard = scan.nextLine();

        name = name.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("\\w", "*");
        surname = surname.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("\\w", "*");

        if (credicard.length()>16 || credicard.length()<16){
            System.out.println("Geçersiz kredi kartı numarsı girdiniz.");
        }else {
            System.out.println("Adınız : "+name+ "\nSoyadınız : "+surname);
            System.out.println(credicard.substring(0,13).replaceAll("\\w","*")+credicard.substring(13));

        }

    }

}
