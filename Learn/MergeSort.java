package Learn;
public class MergeSort {

    // Method untuk menggabungkan dua subarray
    void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[mid + 1 + j];
            
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Method untuk mengimplementasikan Merge Sort
    void sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sort(array, left, mid);
            sort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    // Method untuk mencetak array
    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Array sebelum diurutkan:");
        printArray(array);

        MergeSort ob = new MergeSort();
        ob.sort(array, 0, array.length - 1);

        System.out.println("Array setelah diurutkan:");
        printArray(array);
    }
}