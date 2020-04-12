import java.util.Scanner;

public class Q2_FunnyString {


    public static void main(String[] args) {

        //Q2
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a colour: ");
        String colour = input.nextLine();
        System.out.print("Enter a food: ");
        String food = input.nextLine();
        System.out.print("Enter a animal: ");
        String animal = input.nextLine();
        System.out.print("Enter a friend: ");
        String friend = input.nextLine();
        System.out.println("I had a dream that " + friend + " ate a "+ colour + " "+ animal+" and said it tasted like "+ food +"!");

    }
}
