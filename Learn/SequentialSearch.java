package Learn;
public class SequentialSearch {    
    public static int sequentialSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int n = 50;

        System.out.println("Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        int result = sequentialSearch(data, n);
        if (result != -1) {
            System.out.println("Nilai " + n + " ditemukan! Pada index ke " + result);
        } else {
            System.out.println("Nilai " + n + " tidak ditemukan.");
        }
    }

}
