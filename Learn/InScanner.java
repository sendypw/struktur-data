package Learn;
import java.util.Scanner;

public class InScanner {
    public static void main (String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] negara = new String[5];
            System.out.println("Masukkan nama negara yang Anda ingin input!");
            
            for (int i = 0; i < 5; i++){
                System.out.print("Masukkan nama negara ke "+(i+1)+":");
                negara[i] = input.nextLine();
            };

            System.out.println("Menampilkan nama negara yang telah diinput keyboard");

            for(int i = 0; i < 5; i++){
                System.out.println("Nama negara ke "+i+":"+negara[i]);
            }
        }
    }
}