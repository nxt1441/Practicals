import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args)
    {
        double begin_time = System.nanoTime();
        int n;
        System.out.print("Enter number of items:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }    
        System.out.print("Enter number to find:");
        int x = scan.nextInt();
        int flag =0;
        for(int i=0;i<n;i++)
        {
            
            if(x == arr[i])
            {
                System.out.println("Element found at index:"+i);
                flag = 1;
            }          
        }    
        if(flag == 0)
        {
            System.out.println("Element not found.");
        }
        double endtime = System.nanoTime();
        
        double time =endtime - begin_time;
        System.out.println("Time Analysis:"+time);
    }    
}
