package Learn;

public class NegaraIbukota {
    public static void main(String[] args) {
        String[][] negaraIbukota = {
            {"Australia", "Canberra"},
            {"Jepang", "Tokyo"},
            {"Indonesia", "Jakarta"},
            {"Kanada", "Ottawa"},
            {"Ceko", "Praha"}
        };
        
        // Menampilkan array dua dimensi
        System.out.println("Daftar negara dan ibukotanya:");
        for (int i = 0; i < negaraIbukota.length; i++) {
            System.out.println("Negara: " + negaraIbukota[i][0] + ", Ibukota: " + negaraIbukota[i][1]);
        }
    }
}
