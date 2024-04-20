package day03;

import java.util.Scanner;

public class M11_Substring {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir e posta adresi girmesini isteyin ardından "hotmail" içeriyorsa "gmail" ile değiştirin
                 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen e-postanızı giriniz : ");
        String eposta=scan.nextLine();
        if (eposta.contains("hotmail")){
            eposta=eposta.replaceAll("hotmail","gmail");

        }
        System.out.println("Mail adresiniz : "+eposta);






    }
}
