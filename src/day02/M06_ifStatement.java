package day02;

import java.util.Scanner;

public class M06_ifStatement {
    public static void main(String[] args) {
/*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = “Hafta sonu”  gun=Sali output = “Hafta ici”
       *** String icin equals method’unusalı kullanin
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Gün İsmi Giriniz: ");
        String day = scan.nextLine().toLowerCase();
        if
            (day.equals("pazartesi") || day.equals("salı") || day.equals("çarşamba")
                    || day.equals("perşembe") || day.equals("cuma")){
            System.out.println("Bugün "+day+"\tHafta içi bir gindesiniz iyi çalışmalar");
        }
        if
            (day.equals("cumartesi") || day.equals("pazar")){
            System.out.println("Bugün "+day+"\tHafta sonu bir gindesiniz iyi tatiller");
        }
    }
}
