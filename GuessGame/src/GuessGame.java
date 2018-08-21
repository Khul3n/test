import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int n = reader.nextInt();
        System.out.println("Enter the second number :");
        int k = reader.nextInt();

        if (n <= 50 && k <= 50){
            System.out.println("The numbers are ok");
        } else {
            System.out.println("Please start the program again and enter a new number under 50");
            System.exit(1);
        }
        reader.close();

        Random rand = new Random();
        int m = rand.nextInt(50)+1;
        System.out.println("The first number is: " + n );
        System.out.println("The second number is: " + k);
        System.out.println("Number from java is : " + m);

        if ( n > m )
            System.out.println("Player 1 won");
        else
            System.out.println("Player 1 lost");

        if (k > m )
            System.out.println("Player 2 won");
        else
            System.out.println("Player 2 lost");

        if (k < m && n < m)
            System.out.println("Java won");
        else
            System.out.println("Java lost");

    }
}
