package day03;

public class M10_Substring {
    public static void main(String[] args) {
        /*
        String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz
        String str1=%13,99;
        String str2=%10,55;
         */
        String str1 = "% 13.99";
        String str2 = "% 10.55";

        str2 = str2.substring(1);
        str1 = str1.substring(1);

        double db1 = Double.parseDouble(str1);
        double db2 = Double.parseDouble(str2);


        System.out.println("Sayılar toplamı : " + (db1 + db2));

    }
}
