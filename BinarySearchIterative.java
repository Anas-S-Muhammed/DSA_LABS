// Iterative function to implement Binary Search
public class BinarySearchIterative {

    // Iterative Binary Search method
    public static boolean iterativeFunction(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        // Iterate while start does not cross end
        while (start <= end) {

            // Find the mid index
            int mid = (start + end) / 2;

            // If element is found at mid
            if (arr[mid] == x) {
                return true;
            }
            // If x is greater, search right half
            else if (arr[mid] < x) {
                start = mid + 1;
            }
            // If x is smaller, search left half
            else {
                end = mid - 1;
            }
        }

        // Element not found
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            arr[i] = i + 1;
        }

        int x = 500_000;

        long startTime = System.nanoTime();
        if (iterativeFunction(arr, x)) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }
        long endTime = System.nanoTime();

        System.out.println("Time taken (nanoseconds): " + (endTime - startTime));
    }
}
