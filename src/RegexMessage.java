import java.time.*;
import java.util.*;

public class RegexMessage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String msg=sc.nextLine();
        msg=msg.replace("<<name>>","Shashi")
                .replace("<<full name>>","Shashi Kumar")
                .replaceAll("91-xxxxxxxxxx","91-9876543210")
                .replaceAll("\\d{2}/\\d{2}/\\d{4}",LocalDate.now().toString());
        System.out.println(msg);
    }
}
