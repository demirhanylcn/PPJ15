package PPJ15;

import java.util.Arrays;

public class TASK4 {
    public static void main(String[] args) {
        String[] arr = { "Kate", "Dea", "Mary", "Aea", "Zoe" };
        System.out.println(Arrays.toString(arr));
        sortSel(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortSel(String[] arr) {
        String temp;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i].length() < arr[i + 1].length()) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;

            }
        }
        isLess(arr);

    }

    public static String[] isLess(String[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() == arr[i + 1].length()) {
                if (arr[i].charAt(0) > arr[i + 1].charAt(0)) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        //Collections.reverse(Arrays.asList(arr));

        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return arr;
    }
}
