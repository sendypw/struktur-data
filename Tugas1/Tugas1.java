package Tugas1;

import java.util.LinkedList;

public class Tugas1 {
    public static void main(String args[]){
        // 1. Buatlah sebuah deklarasi variabel dengan tipe data integer yang bernama ‘nilai’?
        int nilai = 50;
        System.out.println("1. Value dari variable nilai adalah : "+nilai);

        // 2. Buatlah sebuah deklarasi variabel dengan tipe data string yang bernama ‘kata’ yang berisi kata ‘struktur’?
        String kata = "struktur";
        System.out.println("2. Value dari variable kata adalah : "+kata);

        // 3. Buatlah pendeklarasian array satu dimensi dengan nama array adalah ‘arraySatu’, tipe data integer, 
        // yang berisi angka (12, 10, 40)? Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. 
        int[] arraySatu = {12,10,40};
        System.out.println("3. Value dari variable arraySatu index pertama adalah "+arraySatu[0]);
        for(int i = 0; i < arraySatu.length; i++){
            System.out.println("Value dari variable arraySatu index "+(i+1)+" adalah "+arraySatu[i]);
        }

        // 4. Buatlah pendeklarasian array dua dimensi dengan nama array adalah ‘arrayDua’, tipe data integer, 
        // yang terdiri dari dua baris dan tiga kolom, seperti pada matrik berikut: 
        //  12  10   40 
        //  13  11   41 
        //  14  12   42 
        //  Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java. 
        int[][] arrayDua = {
            {12,10,40},
            {13,11,41},
            {14,12,42}
        };

        System.out.println("4. Value dari variable arrayDua index pertama pada sub index kedua adalah "+arrayDua[0][1]);
        for(int i = 0; i < arrayDua.length; i++){
            for(int x = 0; x < arrayDua[i].length; x++){
                System.out.print(arrayDua[i][x]+"\t");
            }
            System.out.println();
        }

        // 5. Buatlah deklarasi linked list yang memiliki list (10, 20, 30, 40, 50)? 
        //   Pendeklarasian tersebut dengan menggunakan bahasa pemrograman Java.
        LinkedList<Integer> listAngka = new LinkedList<>();

        listAngka.add(10);
        listAngka.add(20);
        listAngka.add(30);
        listAngka.add(40);
        listAngka.add(50);
        System.out.println("5. Value dari variable LinkedList listAngka adalah :"+listAngka);

        for(int aliasListAngka : listAngka){
            System.out.println("Value dari aliasListAngka adalah "+aliasListAngka);
        }
    }
}
