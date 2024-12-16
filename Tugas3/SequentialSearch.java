package Tugas3;

public class SequentialSearch {
    public static int sequentialSearch(int[] data, int target){
        for(int i = 0; i < data.length; i++){
            if(data[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] data = {10, 20, 30, 40, 50};
        int target = 50;

        int result = sequentialSearch(data, target);

        if(result != -1){
            System.out.println("Nilai "+ target + " ditemukan pada index ke "+ result);
        }else{
            System.out.println("Nilai "+ target + " tidak ditemukan");
        }
    }
}
