
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if(year % 4 == 0 && (year % 100 != 00 || year % 400 == 0)) {
            System.out.println("Year is leap year :" + year);
        }
        else {
            System.out.println("Year is not leap year :" + year );
        }
        }
    }