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
        int[] arr = {1, 3, 5, 7, 8, 9};
        int x = 5;

        if (iterativeFunction(arr, x)) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }

        x = 8;

        if (iterativeFunction(arr, x)) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found!");
        }
    }
}
