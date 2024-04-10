package day01;

import javax.swing.*;

public class M04_JOptionPane {
    public static void main(String[] args) {
        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */
        String name = JOptionPane.showInputDialog("Lütfen İsminizi Giriniz: ");
        String surname = JOptionPane.showInputDialog("Lütfen soy isminizi giriniz: ");
        String ageSTR = JOptionPane.showInputDialog("Lütfen YaşınızGiriniz: ");
        int age = Integer.parseInt(ageSTR); //Bir önceki satırda girilen değer sayısal işlemde kullanılacaksa Parsing yapılmalıdır.
        String mail = JOptionPane.showInputDialog("Lütfen mail adresinizi giriniz: ");
        String pass = JOptionPane.showInputDialog("Lütfen Şifrenizi giriniz: ");


        JOptionPane.showMessageDialog(null,
                " *****       KAYIT BAŞARILI      *****"
                        + "\n Adınız: " + name + "\n " + "Soyadınız: " + surname+
                "\n Yaşınız: " + age
                        + "Mail Adresiniz:" + mail
                        + "\n Şifreniz: " + pass);
/*
JOptionPane ile alınan verileri String olarak döndürür
 */

    }

}
