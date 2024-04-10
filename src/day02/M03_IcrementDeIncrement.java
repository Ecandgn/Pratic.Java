package day02;

public class M03_IcrementDeIncrement {
    public static void main(String[] args) {

        int a = 101;
        System.out.println("Dosya numarası: " + a);
// bir sonraki dosya numarası bir öncekinin 5 fazlası olsun
        a += 5;
        System.out.println("Dosya numarası: " + a);
// dosya numarası birer birer artsın
        a++;
        System.out.println("Dosya numarası: " + a);
        System.out.println("Dosya numarası: " + a);
        a--;
        System.out.println("Dosya numarası: " + a);
        a -= 11;
        System.out.println("Dosya numarası: " + a);
        a+=5;
        System.out.println("Dosya numarası: "+a);
        a/=2;
        System.out.println("Dosya numarası: "+a);
    }
}
