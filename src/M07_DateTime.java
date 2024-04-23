import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class M07_DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("==============");

        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd.MM.yyy HH.mm.SSSS");
        String formated = now.format(forma);
        System.out.println("Şu an : " +formated);
    }
}
