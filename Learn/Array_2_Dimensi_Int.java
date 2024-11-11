package Learn;

import java.util.logging.Logger;

public class Array_2_Dimensi_Int {
    private static final Logger logger = Logger.getLogger(Array_2_Dimensi_Int.class.getName());

    public static void main(String[] args) {
        int[][] DuaDimensi = {{10, 12}, {11, 14}};
        logger.info("Array dengan matriks 2x2:");
        for (int i = 0; i < DuaDimensi.length; i++) {
            for (int j = 0; j < DuaDimensi[i].length; j++) {
                System.out.print(DuaDimensi[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

