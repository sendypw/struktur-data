package Diskusi;
public class Diskusi2 {
    public static void main(String args[]){
        String[][]negaraibukota = {
            {"Australia", "Canberra"},
            {"Jepang", "Tokyo"},
            {"Indonesia", "Jakarta"},
            {"Kanada", "Ottawa"},
            {"Ceko", "Praha"}
        };

        for (int i = 0; i < negaraibukota.length; i++){
            System.out.println("Negara "+negaraibukota[i][0]+", Ibukota "+negaraibukota[i][1]);
        };

        int[][]duadimensi = new int[4][4];

        for (int i = 0; i < duadimensi.length; i++){
            System.out.println(duadimensi[i][0]+" "+duadimensi[i][1]);
        };

        for (int i = 0; i < duadimensi.length; i++) {
            for (int j = 0; j < duadimensi[i].length; j++) {
                System.out.print(duadimensi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
