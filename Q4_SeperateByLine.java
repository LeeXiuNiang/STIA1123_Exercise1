import java.util.Scanner;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        //Q4
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        String number = input.nextLine();
        for(int i=0; i<number.length();i++){
            System.out.println(number.charAt(i));
        }
        int integer=Integer.parseInt(number),sum=0;
        while(integer>0){
            sum += integer%10;
            integer/=10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
