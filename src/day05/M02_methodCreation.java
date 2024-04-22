package day05;

import java.util.Scanner;

public class M02_methodCreation {
    // Bir method oluşturun ve bu öethod iki sayı alıp bu sayıların toplanmasını döndürsün.
    /*
    Bir method tanımlarken
    acces modiferler returnType methodName(paramType param1, paramType param2)
     */
    public static double ikisayitop(double num1, double num2) {
        double a = num1 + num2;
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki adet bir sayi giriniz : ");
        double sayi = scan.nextDouble();
        double sayi1 = scan.nextDouble();
        System.out.println("iki sayinin toplami :" +ikisayitop(sayi,sayi1));

    }
}
