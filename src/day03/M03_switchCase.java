package day03;

import java.util.Scanner;

public class M03_switchCase {
    public static void main(String[] args) {
        /*
           // Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
        // 1. 0()dahil ile 50 arasi - D
        // 2. 50(dahil) ile 60 arası - C
        // 3. 60(dahil) ile 80 arası - B
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz : ");
        int not = scan.nextInt();
        int puan = not / 10;
        switch (puan) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Notunuz D");
                break;
            case 5:
                System.out.println("Notunuz : C");
                break;
            case 6:
            case 7:
                System.out.println("Notunuz : B");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Notunuz : A ");
                break;
            default:
                System.out.println("Gecerli not giriniz");

        }
    }
}


