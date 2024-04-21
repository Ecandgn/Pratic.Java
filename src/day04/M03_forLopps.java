package day04;

public class M03_forLopps {
    public static void main(String[] args) {
        // 1 'den 100 E kadar olan sayılardan 3 ile tam bölünenleri yazdırın

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
