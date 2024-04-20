package day03;

import java.util.Scanner;

public class M04_switchStatements {
    public static void main(String[] args) {
        /*
           1-Kullanicidan bir rakam alip, rakami yaziyla yazdirin
     */
        System.out.println("Lütfen 0-9 araasında bir rakam girin");
        Scanner scan=new Scanner(System.in);
        int input= scan.nextInt();

        switch (input){
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;

        }
    }
}
