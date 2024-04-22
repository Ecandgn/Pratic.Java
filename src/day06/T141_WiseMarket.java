package day06;

import java.util.Scanner;
import java.util.Stack;

public class T141_WiseMarket {
    static Scanner scan = new Scanner(System.in);

    /*
 ====================PROJEMIZ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
 1 ŞARKÜTERİ ÜRÜNLERİ
 2 MANAV ÜRÜNLERİ
 3 MARKET ÜRÜNLERİ
 secime göre;
 4-urunleri listele ve
 5-fiyatlari gelsin
 6-Alışveriş bitince fiş yazdırsın.
 7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/
    public static void main(String[] args) {
        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("-----------T141 WİSE MARKET-----------");
        System.out.println("-----------HOŞ GELDİNİZ-----------");
        System.out.println("Lütfen alışveriş yapacağınız reyonu seçiniz !");
        System.out.println("\t1 ŞARKÜTERİ ÜRÜNLERİ\n\t" + "2 MANAV ÜRÜNLERİ\n\t" + "3 MARKET ÜRÜNLERİ\n\t" + "4-Fiş yazdırma\n\t" + "5-Çıkış\n\t");
        System.out.print("Seçiminiz : ");
        int secim = scan.nextInt();


        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Geçersiz bir tuşa bastınız");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sakuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisyazdir();
                    break;
                case 5:
                    cikis();
                    break;

            }
        }
    }

    private static void sakuteri() {
        System.out.println("---- Şarküteri Reyonuna Hoşgeldiniz ----");
        System.out.println("Lütfen almak istediğiniz ürünü seçiniz");
        System.out.println("\t101-Peynir   250₺\n\t102-Tereyağ   500₺\n\t103-Yoğurt   30₺\n\t104-Sucuk   320₺\n\t105-Yumurta   95₺");
    }

    private static void manav() {
        System.out.println("Manav Reyonuna Hoş Geldiniz.");
    }

    private static void market() {
        System.out.println("Market Reyonuna Hoş Geldiniz.");
    }

    private static void fisyazdir() {
        System.out.println("Fiş yazdırma ekranına yönlendiriliyorsunuz..");
    }

    private static void cikis() {
        System.out.println("Çıkış Yapılıyor");
        System.exit(0);
    }
}



