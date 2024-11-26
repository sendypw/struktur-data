public class CountingSort {
    void sort(char arr[]){
        int n = arr.length;

        // cari maksimum elemen pada array
        char max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int count[] = new int[max + 1];

        for(int i = 0; i <= max; ++i){
            count[i] = 0;
        }

        // store count of each char
        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }

        for(int i = 1; i <= max; i++){
            count[i] += count[i-1];
        }

        // build the output array
        char output[] = new char[n];
        for(int i = n - 1; i >= 0; i--){
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // copy output to arr
        for(int i = 0; i < n; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String args[]){
        CountingSort cs = new CountingSort();
        char arr[] = {'d','a','c','b','e','a'};
        cs.sort(arr);

        System.out.print("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
