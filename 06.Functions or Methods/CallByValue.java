public class CallByValue {
    public static void main(String[] args) {
        //Swap - value exechange
        int a = 5;
        int b = 10;
        
        //Swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}