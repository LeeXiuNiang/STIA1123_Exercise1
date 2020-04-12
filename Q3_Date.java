import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Q3_Date {

    public static void main(String[] args) throws ParseException {
        //Q3
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date in format of dd/MM/yy:");
        String strdate=input.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date date = formatter.parse(strdate);
        System.out.print("Date format with dd.MM.yy: ");
        System.out.println(new SimpleDateFormat("dd.MM.yy").format(date));
    }
}
