package day05;

import java.util.Scanner;

public class M01_methodCreation {
    // bir method oluşturun ve bir method string alıp bu string in uzunluğunu döndürsün.

    public static int calculatelengt(String text) {


        return text.length();
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String metin=scan.nextLine();
        System.out.println("Girilen metnin uzunluğu : "+calculatelengt(metin));
    }
}
