package Learn;
public class BinarySearch {
    public static int binarySearch(int[] data, int target) {
        int awal = 0;
        int akhir = data.length - 1;

        while (awal <= akhir) {
            int pertengahan = (awal + akhir) / 2;
            if (data[pertengahan] == target) {
                return pertengahan;
            } else if (data[pertengahan] < target) {
                awal = pertengahan + 1;
            } else {
                akhir = pertengahan - 1;
            }
        }

        return -1; // Target tidak ditemukan
    }
    
    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10};
        int target = 8;

        System.out.println("Pencarian Target " + target + " pada Data:");
        System.out.println("Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        int hasil = binarySearch(data, target);
        if (hasil == -1) {
            System.out.println("Target tidak ditemukan");
        } else {
            System.out.println("Target ditemukan pada posisi: " + hasil);
        }
    }


}
