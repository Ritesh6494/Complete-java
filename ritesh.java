import java.util.Scanner;

public class ritesh {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        int n = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (n > 0) {

            int digit = n % 10;

            decimal = decimal + digit * (int)Math.pow(2, power);

            n = n / 10;
            power++;
        }

        System.out.println("Decimal = " + decimal);
    }
}