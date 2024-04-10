package day01;

public class M01_helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Merhaba Dünya");
        System.out.println("    Java Dünyasına Hoş Geldiniz ");
        System.out.println("\n Sayın Yetkili");
        System.out.println("\t Sayın Yetkili");
        System.out.println("Firmamıza yaptığınız");
        System.out.println("---------");

        // Javada tek satırlık yorum yazamak için // kullanılır
        /*
        Bu şekilde yapılan yorumlar
        aynı satırda olmak zorunda değildir.
         */

        /*
        Konsola Hello World ve "Hello World"
        yazdırın
         */
        // System.out.println() ile " işareti yapmak için \" bu işaret kullanılır
        System.out.println("Hello World ve \" Hello World \" ");
        System.out.println("-------------");
        /*
            \" : metin içinde çift tırnak işareti koya
            \t : metin içinde bir tab boşluk bırakır
            \n : Bulunduğu noktadan itibaren metni at satıra kaydırır
            \' : Bulunduğu noktadan itibaren tek tırnak bırakır
            \\ : Metnin içinde \ işareti koyar
                     */
/*
Değer atayarak aşağıdaki metni tek bir System.out.println("Hello World");içinde yazdırın
1 Metin Tarık Yiğit - QA Sofware Test Engineer
2.Metin Tarık Yiğit
        QA Sofware Test Engineer
 */
        String name = "Tarık";
        String surname = "Yiğit";
        String job = "QA Sofware Test Engineer";
        System.out.println(name+" "+surname+" - "+job);
        System.out.println(name+" "+surname+"\n"+job);


    }
}
