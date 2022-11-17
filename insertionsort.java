import java.util.Scanner;



public class insertionsort {
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
        instsort(arr);
        double time = System.nanoTime() - begin_time;
        System.out.println("Time:"+time);

    }

    private static void instsort(int[] arr) {
        for (int i = 1; i < arr.length; ++i)
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            display(arr);
        }
        System.out.println("Sorted Array");
        display(arr);
    }

    private static void display(int arr[])
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(" "+arr[i]+" ");
        }
        System.out.println("");
    }
}
