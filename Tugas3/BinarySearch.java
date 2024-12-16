package Tugas3;

public class BinarySearch {
    public static int binarySearch(int[] data, int target){
        int awal = 0;
        int akhir = data.length - 1;

        while(awal <= akhir){
            int pertengahan = (awal + akhir) / 2;
            if(data[pertengahan] == target){
                return pertengahan;
            } else if(data[pertengahan] < target){
                awal = pertengahan + 1;
            } else {
                akhir = pertengahan - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] data = {2,4,6,8,10};
        int target = 8;

        int result = binarySearch(data, target);

        if(result == -1){   
            System.out.println("Target tidak ditemukan");
        }else{
            System.out.println("Target "+ target+" ditemukan pada index ke "+result);
        }
    }
}