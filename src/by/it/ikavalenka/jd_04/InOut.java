package by.it.ikavalenka.jd_04;

/**
 * Created by USER on 27.02.2017.
 */
public class InOut {
    static void arrayPrint(double[][] m, String name, boolean showIndex) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (showIndex) {
                    System.out.printf("%s[%1d,%1d]=%8.4f", name, i, j, m[i][j]);
                } else {
                    System.out.printf("%-8.4f", m[i][j]);
                }
            }
            System.out.println();
        }
    }


    static void arrayPrint(double[] arr,String name, int cols) {
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[%1d]=%8.4f", name, i, arr[i]);
            col++;
            if (col == cols) {
                System.out.println();
                col = 0;
            }
        }
    }
}