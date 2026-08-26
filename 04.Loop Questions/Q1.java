
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.print("Enter your number :");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }

               System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            
            choice = sc.nextInt();
            
        } while (choice==1);

        System.out.println("Sum of even number: " + evensum);
        System.out.println("Sum of odd number: " + oddsum);
    }

}