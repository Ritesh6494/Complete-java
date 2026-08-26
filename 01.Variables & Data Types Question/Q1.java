
import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        float B = sc.nextFloat();
        double C = sc.nextDouble();
        double average = (A + B + C)/3;
        System.out.println("average = " + average);
    }
}