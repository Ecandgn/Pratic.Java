package day07;
import java.util.Arrays;
public class M03_multiDimesionalArrays {
    public static void main(String[] args) {
        /*
         * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
         *
         * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
         */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] arr = str.split(" ");
        int toplam$ = 0;
        int toplam£ = 0;
        System.out.println(Arrays.toString(arr));
        for (String s : arr) {
            if (s.contains("$")) {
                toplam$ += Integer.parseInt(s.replace("$", ""));
            } else {
                toplam£ += Integer.parseInt(s.replace("£", ""));
            }
        }
        System.out.println("Dolarların Sipariş toplamı: " + toplam$);
        System.out.println("Dolarların Sipariş toplamı: " + toplam£);
    }
}
