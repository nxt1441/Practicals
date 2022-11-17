import java.util.Scanner;

public class factorialRecursive {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter Number:");
        num = scan.nextInt();
        int factorial = factnum(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static int factnum(int num)
    {
        if (num >= 1)
            return num * factnum(num - 1);
        else
            return 1;
    }
}