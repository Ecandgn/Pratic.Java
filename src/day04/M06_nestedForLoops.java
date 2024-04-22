package day04;

public class M06_nestedForLoops {
    public static void main(String[] args) {
        /*
 Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *

           şeklini konsola yazdiriniz.
 */
        int boyut = 5; // Baklavanın çapını belirledik.

        for (int i = 1; i < boyut; i++) {
            for (int j = 1 ; j <= boyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = boyut - 1; i >= 1; i--) {
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
