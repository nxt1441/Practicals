import java.util.Scanner;

public class binarysearch {

  
    
    static int arr[] = new int[5];
    int temp;
    static int first;
    static int last;
    static int mid;
    static double begin_time; 
    int data; 
    private static void insert() {
        System.out.println("Enter Array of size 5:");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
       sort();
    }

    private static void sort() 
    {
        for(int i=0;i<arr.length;i++)
        {
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i] > arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
        System.out.println("Soreted Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Enter data to search");
        Scanner scan = new Scanner(System.in);
        int data= scan.nextInt();
        search(data);
    }
    

    private static int search(int data) 
    {
         begin_time = System.nanoTime();
        first = 0;
       	last = arr.length - 1;
	mid = (first + last) / 2;
		while(first <= last)
		{
			if(arr[mid] < data)
			{
				first = mid + 1;
			}	
			else if(arr[mid] == data)
			{
				System.out.println("Found at index:"+ mid);
				return 0;	
			}
			else if(arr[mid] > data)
			{
				last = mid - 1;
			}
			mid = (first + last)/2;
		}	
		if(first>last)
			System.out.println("Not found!"+ data);
                
                return 0;
    }
    
    public static void main(String[] args)
    {
       
        insert();
        double end_time = System.nanoTime();
        double time = end_time - begin_time;
        System.out.println("Time Analysis:"+time);
    }
    
}
