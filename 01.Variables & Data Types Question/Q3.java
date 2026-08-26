
import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat() ;
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        System.out.println("Bill is" + totalCost);
        float new_total_cost = totalCost + (totalCost * 0.18f);
        System.out.println("Bill with GST :" + new_total_cost);

    }
}