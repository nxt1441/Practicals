import java.util.Scanner;

public class selection {
    public static void main(String[] args)
    {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter Number of elements:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" values:");
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
        double begin_time = System.nanoTime();
        selectionsort(arr);
        double time = System.nanoTime() - begin_time;
        System.out.println("Time:"+time);
    }

    private static void selectionsort(int[] arr) {
        for(int i=0;i< arr.length;i++)
        {
            int min = i;
            for(int j = i+1;j< arr.length;j++)
            {
                if(arr[j] < arr[min])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
