package day07;

public class M04_constructor {
    /*
    bir müşteri sınıfı oluşturduk. müşterinin özelliklerini oluşturalım
     */
    String name;
    String surname;
    String email;
    String phoneNumber;

    public M04_constructor() {
        name = "Bilinmiyor";
        surname = "Bilinmiyor";
        email = "Bilinmiyor";
        phoneNumber = "Bilinmiyor";
    }

    public M04_constructor(String name, String surname, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void bilgileriYazdir() {
        System.out.println("Müşteri Bilgileri");
        System.out.println("Adı :" + name);
        System.out.println("Soyadı :" + surname);
        System.out.println("Email :" + email);
        System.out.println("Telefon :" + phoneNumber);
    }

    public static void main(String[] args) {
        M04_constructor musteri1 = new M04_constructor();
        musteri1.bilgileriYazdir();
        System.out.println("-----------");
        M04_constructor musteri2 = new M04_constructor("Ahmet", "Bulut", "ahmet@wyh", "85318965");
        musteri2.bilgileriYazdir();
    }
}
