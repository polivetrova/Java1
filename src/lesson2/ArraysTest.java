package lesson2;

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        final int SIZE = 5;
        double[] data = new double[5];

        data[0] = 123.5532;
        data[1] = 23424.234212342355;
        data[2] = 2.342342;
        data[3] = 3242323.234234;

      //  Arrays.sort(data);
        //Arrays.fill(data, 2 );
        //System.out.println(Arrays.toString(data));

        /*for(int i = 0; i <data.length; i++){
            System.out.printf("Index #%d: %.2f%n", i, data[i]);
            //%s - cтрока %d  - число %f - float %n - перенос строки
        }*/

        int[][] deepData = new int[7][7];

        int n = 0;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = ++n;
            }
        }
            /*for (int i = 0; i < deepData.length; i++){
                for (int j = 0; j < deepData[i].length; j++){
                    System.out.printf("%2d ", deepData[i][j]);
                }
                System.out.println();
        }*/

        char[] chars = {'h','e','l','l','o'};
        String str = new String(chars);

        for (char c : str.toCharArray()){
            System.out.println(c);
        }

        for (int i = 0; i< 5000; i++){
            System.out.printf("%d : %c ", i, i);
            if(i % 25 == 0){
                System.out.println();
            }
        }

        /*static void method(int[] arr){
            
        }*/
    }
}
