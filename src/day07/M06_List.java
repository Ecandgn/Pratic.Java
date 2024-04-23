package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M06_List {
    /*
    Bir öğretmenden girmek istediği kadar notu alınız ve
    ortalamayı geçen öğrenci sayısını bulunuz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> not = new ArrayList<>();
        System.out.println("Not girişi için E tuşuna basınız : ");
        char devam = scan.next().charAt(0);
        double toplama = 0;

        while (devam == 'E' || devam == 'e') {
            System.out.println("Not Girişi : ");
            not.add(scan.nextDouble());
            System.out.print("Yeni Not Girmek İçin E tuşuna, sonlandırmak için farklı bir tuşa basınız :  ");
            devam = scan.next().charAt(0);
        }
        System.out.println("Sisteme Girilen notlar : " + not);
        for (int i = 0; i < not.size(); i++) {
            toplama += not.get(i);
        }
        double ortalama = toplama /not.size();
        System.out.println("Sisteme Girilen notların ortalaması : " + ortalama);

        List<Double> ortGecen = new ArrayList<>();
        for (double a : not) {
            if (a > ortalama) {
                ortGecen.add(a);
            }
        }

        System.out.println("Ortalamayı geçen Öğrenci Sayısı : " + ortGecen.size());

    }
}
