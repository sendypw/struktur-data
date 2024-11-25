package Learn;

class CountingSortChar {
    void sort(char arr[]) {
        int n = arr.length;

        // Find the maximum element in the array
        char max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store count of individual characters
        int count[] = new int[max + 1];

        // Initialize count array with all zeros
        for (int i = 0; i <= max; ++i) {
            count[i] = 0;
        }

        // Store count of each character
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Change count[i] so that count[i] now contains actual position of this character in output array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        char output[] = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the output array to arr, so that arr now contains sorted characters
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Driver method
    public static void main(String args[]) {
        CountingSortChar cs = new CountingSortChar();
        char arr[] = {'d', 'a', 'c', 'b', 'e', 'a'}; // Example array of characters
        cs.sort(arr);

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}