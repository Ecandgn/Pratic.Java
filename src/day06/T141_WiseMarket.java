package day06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Stack;

public class T141_WiseMarket {
    static Scanner scan = new Scanner(System.in);
    static boolean ekUrun = false;
    static int urunKodu;
    static String urunAd;
    static int urunFiyat;
    static int urunAdeti;
    static int toplam;
    static String sepet = "\n";

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
        while (!ekUrun) {
            System.out.println("Ürün Kodunu Giriniz.");
            urunKodu = scan.nextInt();
            if (urunKodu == 0) {
                girisEkrani();
            } else if (!(urunKodu >= 101 && urunKodu <= 105)) {
                System.out.println("Yanlış bir kod girdiniz. Tekrar Deneyiniz");
                sakuteri();
            } else if (urunKodu >= 101 && urunKodu <= 105) {
                System.out.print("Kaç Paket alacaksınız?: ");
                urunAdeti = scan.nextInt();
                switch (urunKodu) {
                    case 101:
                        urunAd = "Peynir.";
                        urunFiyat = 250;
                        System.out.println(urunAdeti + " Paket " + urunAd + "fiyati :" + (urunAdeti + urunFiyat) + " 'Tl dir.");
                        break;
                    case 102:
                        urunAd = "Tereyağ.";
                        urunFiyat = 500;
                        System.out.println(urunAdeti + " Paket " + urunAd + "fiyati :" + (urunAdeti + urunFiyat) + " 'Tl dir.");
                        break;
                    case 103:
                        urunAd = "Yoğurt.";
                        urunFiyat = 320;
                        System.out.println(urunAdeti + " Paket " + urunAd + "fiyati :" + (urunAdeti + urunFiyat) + " 'Tl dir.");
                        break;
                    case 104:
                        urunAd = "Sucuk.";
                        urunFiyat = 320;
                        System.out.println(urunAdeti + " Paket " + urunAd + "fiyati :" + (urunAdeti + urunFiyat) + " 'Tl dir.");
                        break;
                    case 105:
                        urunAd = "Yumurta.";
                        urunFiyat = 95;
                        System.out.println(urunAdeti + " Paket " + urunAd + "fiyati :" + (urunAdeti + urunFiyat) + " 'Tl dir.");
                        break;

                }
                urunFiyat = urunAdeti * urunFiyat;
                toplam += urunFiyat;
                System.out.println("Toplam Tutar: " + toplam);
                sepet += urunAdeti + " paket" + urunAd + "fiyati: " + urunFiyat + "Tl Dir.\n";
                System.out.println("Başka bir ürün isterseniz ürün kodu girin. istemiyorsanız ana menüye dönmek için 0 tuşuna basınız. ");


            }
        }
        ekUrun = false;
    }

    private static void manav() {
        System.out.println("---- Manav Reyonuna Hoşgeldiniz ----");
        System.out.println("Lütfen almak istediğiniz ürünü seçiniz");
        System.out.println("\t201-Elma   40₺\n\t202-Portakal   40₺\n\t203-Salatalık   30₺\n\t204-Domates   35₺\n\t205-Muz   45₺");
        while (!ekUrun) {
            System.out.print("ürün Kodu: ");
            urunKodu = scan.nextInt();
            if (urunKodu == 0) {
                girisEkrani();

            } else if (!(urunKodu >= 201 && urunKodu <= 205)) {
                System.out.println("Lütfen Geçerli Bir Kod Giriniz");
                manav();
            } else if (urunKodu >= 201 && urunKodu <= 205) {
                System.out.println("Kaç kg alacaksınnız ? ");
                urunAdeti = scan.nextInt();
                switch (urunKodu) {
                    case 201:
                        urunAd = "Elma";
                        urunFiyat = 40;
                        System.out.println(urunAdeti + " kg " + urunAd + " fiyatı: " + (urunAdeti * urunFiyat) + "'TL'dir ");
                        break;
                    case 202:
                        urunAd = "Portakal";
                        urunFiyat = 40;
                        System.out.println(urunAdeti + " kg " + urunAd + " fiyatı: " + (urunAdeti * urunFiyat) + "'TL'dir");
                        break;
                    case 203:
                        urunAd = "Salatalık";
                        urunFiyat = 30;
                        System.out.println(urunAdeti + " kg " + urunAd + " fiyatı: " + (urunAdeti * urunFiyat) + "'TL'dir");
                        break;
                    case 204:
                        urunAd = "Domates";
                        urunFiyat = 35;
                        System.out.println(urunAdeti + " kg " + urunAd + " fiyatı: " + (urunAdeti * urunFiyat) + "'TL'dir");
                        break;
                    case 205:
                        urunAd = "Muz";
                        urunFiyat = 45;
                        System.out.println(urunAdeti + " kg " + urunAd + " fiyatı: " + (urunAdeti * urunFiyat) + "'TL'dir");
                        break;
                    default:

                }
                urunFiyat = urunAdeti * urunFiyat;
                toplam += urunFiyat;
                System.out.println("Oluşan tutar: " + toplam);
                sepet += urunAd + " paket" + urunAdeti + "fiyatı" + urunFiyat + "₺ tl  dir.\n";
                System.out.println("Başka bir ürün isterseniz Ürün Kodunu giriniz. İstemiyorsanız ana menüye dönmek için 0 tuşuna basınız");
            }
        }
        ekUrun = false;
    }

    private static void market() {
        System.out.println("---- Market Reyonuna Hoşgeldiniz ----");
        System.out.println("Lütfen almak istediğiniz ürün kodunu giriniz");
        System.out.println("\t301-Nutella 750g   128₺\n\t302-Makarna   20₺\n\t303-CiciBebe   50₺\n\t304-Dondurma   75₺\n\t305-Centro Muzlu Gofret   35₺");
        while(!ekUrun) {
            System.out.print("Ürün Kodu: ");
            urunKodu= scan.nextInt();
            if (urunKodu==0){
                girisEkrani();
            } else if (!(urunKodu>=301 && urunKodu<=305)) {
                System.out.println("Lütfen Geçerli Bir Kod Giriniz");
                market();
            } else if (urunKodu>=301 && urunKodu<=305) {
                System.out.println("Kaç Adet alacaksınız?");
                urunAdeti= scan.nextInt();
                switch (urunKodu){
                    case 301:
                        urunAd="Nutella 750g";
                        urunFiyat=128;
                        System.out.println(urunAdeti+" Adet "+urunAd+" fiyatı: "+(urunAdeti*urunFiyat)+"'TL'dir");
                        break;
                    case 302:
                        urunAd="Makarna";
                        urunFiyat=20;
                        System.out.println(urunAdeti+" Adet "+urunAd+" fiyatı: "+(urunAdeti*urunFiyat)+"'TL'dir");
                        break;
                    case 303:
                        urunAd="CiciBebe";
                        urunFiyat=50;
                        System.out.println(urunAdeti+" Adet "+urunAd+" fiyatı: "+(urunAdeti*urunFiyat)+"'TL'dir");
                        break;
                    case 304:
                        urunAd="Dondurma";
                        urunFiyat=75;
                        System.out.println(urunAdeti+" Adet "+urunAd+" fiyatı: "+(urunAdeti*urunFiyat)+"'TL'dir");
                        break;
                    case 305:
                        urunAd="Centro Muzlu Gofret";
                        urunFiyat=35;
                        System.out.println(urunAdeti+" Adet "+urunAd+" fiyatı: "+(urunAdeti*urunFiyat)+"'TL'dir");
                        break;
                    default:

                }
                urunFiyat=urunAdeti*urunFiyat;
                toplam+=urunFiyat;
                System.out.println("Oluşan tutar: "+toplam);
                sepet+=urunAd+"    paket "+urunAdeti+"    fiyatı: "+urunFiyat+"'TL'dir\n";

                System.out.println("Başka bir ürün isterseniz Ürün Kodunu giriniz. İstemiyorsanız ana menüye dönmek için 0 tuşuna basınız");

            }
        }
        ekUrun=false;
    }


    private static void fisyazdir() {
        System.out.println("Fiş yazdırma ekranına yönlendiriliyorsunuz");
        System.out.println("                                             ");
        System.out.println("-----------   Alışveriş Fişi   -----------");
        System.out.println("-----------   T141 WISE MARKET   -----------");
        System.out.println(" ");
        System.out.println("Alınan Ürünler\n------------------------------\n" + sepet);
        System.out.println("Toplam tutar: " + toplam);
        System.out.println("%8 KDV: " + (toplam * 0.08));
        toplam *= 1.08;
        System.out.println("Ödenecek Tutar: " + toplam);
        System.out.println("Ödenen: ");
        int odenen = scan.nextInt();
        if (odenen < toplam) {
            System.out.println("Ödeme yeterli değil. " + (toplam - odenen) + " kadar daha ödeme yapmalısınız.");
        } else {
            System.out.println("Para Üstü: " + (odenen - toplam));
        }
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz\nYine Bekleriz\n\nTeklif Etme Veresiye, Dost Kalalım Ölesiye (byKerim)");
   LocalDate date=LocalDate.now();
        System.out.println(date);
        cikis();
    }

    private static void cikis() {
        System.out.println("Çıkış Yapılıyor");
        System.exit(0);
    }
}



