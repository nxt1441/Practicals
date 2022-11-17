import java.util.Scanner;

public class merge {

    public static void main(String[] args) {
        Scanner ap = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = ap.nextInt();
        int[] a = new int[size];
        System.out.println("Enter element of an array: ");
        for (int i = 0; i < size; i++) {
            a[i] = ap.nextInt();
        }
        long begin = System.nanoTime();
        mergesort(a);
        long end = System.nanoTime();
        long diff = end-begin;
        System.out.println("Time : "+diff);

        System.out.println("Sorted array:");
        for(int i=0;i<size;i++){
            System.out.println(a[i]);
        }

    }

    private static void mergesort(int[] inputArray) {
        int arrayLength = inputArray.length;

        if (arrayLength < 2) {
            return;
        }

        int midPoint = arrayLength / 2;
        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[arrayLength - midPoint];
        System.arraycopy(inputArray, 0, leftArray, 0, midPoint);
        for (int i = midPoint; i < arrayLength; i++) {
            rightArray[i - midPoint] = inputArray[i];
        }

        mergesort(leftArray);
        mergesort(rightArray);

        merge(inputArray, leftArray, rightArray);
    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;

        int x = 0;
        int y = 0;
        int z = 0;

        while (x < leftArrayLength && y < rightArrayLength) {
            if (leftArray[x] <= rightArray[y]) {
                inputArray[z] = leftArray[x];
                x++;
            } else {
                inputArray[z] = rightArray[y];
                y++;
            }
            z++;
        }

        while (x < leftArrayLength) {
            inputArray[z] = leftArray[x];
            x++;
            z++;
        }

        while (y < rightArrayLength) {
            inputArray[z] = rightArray[y];
            y++;
            z++;
        }

    }
}