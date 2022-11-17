import java.util.Scanner;

public class buublesort {
    
    public static void main(String[] args)
    {
        double begin_time = System.nanoTime();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of items:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array:");
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        
        for(int i=0;i<n;i++)

	{

		for(int j=i+1; j<n; j++)

		{

			if(arr[i] > arr[j])

			{

				int temp = arr[i];

				arr[i] = arr[j];

				arr[j] = temp;

			}

		}

	}
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(" "+arr[i]);
        }
        double endtime = System.nanoTime();
        double time = endtime - begin_time;
        System.out.println("Time Analysis: "+time);
        
    }
    
}
