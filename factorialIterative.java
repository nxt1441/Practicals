import java.sql.SQLOutput;
import java.util.Scanner;

public class factorialIterative {
    public static void main(String[] args) {
        int n, num =1 ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:");
        n = scan.nextInt();
        while (n > 1) {
            num = num * n;
            n -= 1;
        }
        System.out.println("Factorial:"+num);
    }
}