package Learn;
import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String args[]){
        LinkedList<String>buku = new LinkedList<>();

        buku.add("Hujan");
        buku.add("Bumi");
        buku.add("Pulang");
        buku.add("Rindu");
        buku.add("Rasa");

        System.out.println("Nama buku: " + buku);
        System.out.println("Jumlah buku " + buku.size());
    }
}
