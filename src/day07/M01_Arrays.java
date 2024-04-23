package day07;

import java.util.Arrays;
import java.util.Scanner;

public class M01_Arrays {
    /* kullanıcıdan girdiği sayı kadar int array oluşturan ve array elemanlarını kullanıcıdan
    alan ve girilen array elemanlarının en büyük ile en küçük
    elemanının arasındaki farkı gösteren java programı yazın
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Array değerini giriniz : ");
        int sayi = scan.nextInt();
        int arr[] = new int[sayi];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1+". sayıyı giriniz.");
            int sayi2=scan.nextInt();
            arr[i]=sayi2;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); // sıralar
        System.out.println(Arrays.toString(arr));
        System.out.println("En büyük ile en küçük eleman arasındaki fark : "+(arr[arr.length-1]-arr[0]));
    }
}
