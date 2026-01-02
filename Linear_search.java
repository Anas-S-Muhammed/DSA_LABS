import java.io.*;

class Linear_search {

    public static int search(int arr[], int N, int x) {
        // Iterate over the array in order to
        // find the key x
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            arr[i] = i + 1;
        }

        int x = 500_000;

        long startTime = System.nanoTime();
        int result = search(arr, arr.length, x);
        long endTime = System.nanoTime();

        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);

        System.out.println();
        System.out.println("Time taken (nanoseconds): " + (endTime - startTime));
    }
}
