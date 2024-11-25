package Learn;

class CountingSortInt {
    void sort(int arr[]) {
        int n = arr.length;

        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store count of individual elements
        int count[] = new int[max + 1];

        // Initialize count array with all zeros
        for (int i = 0; i <= max; ++i) {
            count[i] = 0;
        }

        // Store count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Change count[i] so that count[i] now contains actual position of this element in output array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int output[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the output array to arr, so that arr now contains sorted elements
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Driver method
    public static void main(String args[]) {
        CountingSortInt cs = new CountingSortInt();
        int arr[] = {5, 2, 9, 5, 2, 3}; // Example array a1 to a6
        cs.sort(arr);

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}