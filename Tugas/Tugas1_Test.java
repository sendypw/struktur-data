import java.util.LinkedList;

public class Tugas1_Test {
    public static void main(String args[]){
        // 1. Buatlah sebuah deklarasi variabel dengan 
        // tipe data integer yang bernama ‘nilai’?
        
        // Deklarasi variable dengan tipe integer
        int nilai = 30; // misalnya diberikan nilai 30

        // menampilkan hasil nilai akhir
        System.out.println("1. Value pada variable nilai adalah "+ nilai);

        // 2. Buatlah sebuah deklarasi variabel dengan tipe data string 
        // yang bernama ‘kata’ yang berisi kata ‘struktur’? 

        // Deklarasi variable dengan tipe data string
        String kata = "struktur";

        // menampilkan hasil nilai variable kata
        System.out.println("2. Value pada variable kata adalah "+ kata);

        // 3. Buatlah pendeklarasian array satu dimensi dengan nama array adalah ‘arraySatu’, tipe data integer,
        // yang berisi angka (12, 10, 40)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java

        // Deklarasi variable array dengan tipe integer
        int[] arraySatu;

        arraySatu = new int[3];
        arraySatu[0] = 12;
        arraySatu[1] = 10;
        arraySatu[2] = 40;

        System.out.println("3. Value pada variable arraySatu adalah ");

        for (int i = 0; i < arraySatu.length; i++){
            System.out.println(arraySatu[i]);
        }

        // 4. Buatlah pendeklarasian array dua dimensi dengan nama array adalah ‘arrayDua’, tipe data integer, 
        // yang terdiri dari dua baris dan tiga kolom, seperti pada matrik berikut: 
        //  12  10   40
        //  13  11   41 
        //  14  12   42
        
        // Deklarasi variable array dua dimensi dengan tipe integer
        int[][] arrayDua = {
            {12,10,40},
            {13,11,41},
            {14,12,42}
        };

        // menampilkan isi arrayDua
        System.out.println("4. Value pada variable arrayDua adalah ");
        for (int i = 0; i < arrayDua.length; i++){
            for (int j = 0; j < arrayDua[i].length; j++){
                System.out.print(arrayDua[i][j]+"\t");
            }
            System.out.println();
        }
        

        // 5. Buatlah deklarasi linked list yang memiliki list (10, 20, 30, 40, 50)? 
        // Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. 

        // Deklarasi LinkedList bertipe Integer dengan nama listInt
        LinkedList<Integer> listInt = new LinkedList<>();

        // menambahkan elemen2 ke dalam LinkedList
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(40);
        listInt.add(50);

        // menampilkan nilai listInt
        System.out.println("5. Value pada variable listInt adalah: "+listInt);
        for(int llNilaiAngka : listInt){
            System.out.println(llNilaiAngka);
        }
    }
}
