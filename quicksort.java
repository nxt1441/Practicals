import java.util.Scanner;

public class quicksort {
    
    public static void main(String[] args)
    {
        double begin_time, end_time,time;
        int arr[] = new int[6];
        System.out.println ("Enter 6 elements:");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            arr[i] = scan.nextInt();
        }
        begin_time = System.nanoTime();
        quicksort(arr,0,5);
        
        System.out.println("Sorted Array:");
        for(int i=0;i<6;i++)
        {
            System.out.print(" "+ arr[i]);
        }
        System.out.println("");
        end_time = System.nanoTime() - begin_time;
        System.out.println("Time Analysis:"+end_time);
        
    }

    private static void quicksort(int[] arr, int low, int high) 
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
       
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
           if (arr[j] <= pivot) 
           {
                i++;
                int  temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
           }
         }
        int temp ;
        temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i + 1);
       }
}
  
