package PPJ15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TASK2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 7, 5, 3},
                {8, 6, 4, 2},};

            printArr(rotatedArr(arr));
    }



    public static int[][] rotatedArr (int[][] arr) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;


            }
        }
        for(int i=0;i<arr.length;i++)
        {

            int low = 0;
            int high = arr.length-1;
            while(low < high)
            {
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }
        return arr;
    }

    public static void printArr ( int[][] arr) {
        for (int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
