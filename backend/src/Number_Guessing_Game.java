import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        Random ran_number = new Random();
        int max = 100 ;
        int you_tried = 0;
        int  numb= ran_number.nextInt(max);
        int gusse = -1;
        while(gusse != numb){
            System.out.println("Enter your guess: ");
            gusse = user_input.nextInt();
            if (gusse < numb) {
                // Guess is too low
                System.out.println("Too low, please try again");
                you_tried += 1;
            }
            else if (gusse > numb) {
                // Guess is too high
                System.out.println("Too high, please try again");
                you_tried += 1;
            }
            else {
                // Guess is correct !!
                System.out.println("Correct, the number was " + numb );
                you_tried += 1;
            }
        }
        System.out.println("you tried: "+ you_tried +"times");


    }
}
