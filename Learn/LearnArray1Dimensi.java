package Learn;
public class LearnArray1Dimensi {
    public static void main(String args[]){
        String[] cetakA;
        cetakA = new String[3];
        cetakA[0] = "Jakarta";
        cetakA[1] = "Bandung";
        cetakA[2] = "Surabaya";

        System.out.println("Menampilkan urutan kota ke-2 yaitu: " + cetakA[1] );

        System.out.println("Menampilkan seluruh urutan: ");

        for(int i=0; i<3; i++){
            System.out.println((i+1) + " " + cetakA[i]);
        }
    }
}