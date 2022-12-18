package PPJ15;

import java.util.Arrays;

public class TASK3 {
    public class FuncStat {
        public static int fiboR(int n) {
            if (n == 0)
                return 0;
            if (n == 1)
                return 1;
            return fiboR(n - 1) + fiboR(n - 2);
        }

        public static int fiboI(int n) {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 1; i <= n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            return c;
        }

        public static int factR(int n) {
            if (n == 0)
                return 1;
            return n * factR(n - 1);

        }

        public static int factI(int n) {
            if (n == 0)
                return 1;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }

        public static int gcdR(int a, int b) {
            if (b == 0)
                return a;
            return gcdR(b, a % b);
        }

        public static int gcdI(int a, int b) {
            int temp = 0;
            while (true) {
                temp = b;
                b = a % b;
                a = temp;
                if (b == 0)
                    return a;
            }
        }

        public static int maxElem(int[] arr, int from) {
            if (arr.length - 1 == from)
                return arr[from];
            int next = maxElem(arr, from + 1);
            if (arr[from] > next)
                return arr[from];
            else
                return next;
        }

        public static int numEven(int[] arr, int from) {
            if (arr.length - 1 == from) {
                if (arr[from] % 2 == 0)
                    return 1;
                else
                    return 0;
            }
            if (arr[from] % 2 == 0)
                return 1 + numEven(arr, from + 1);
            else
                return 0 + numEven(arr, from + 1);
        }

        public static void reverse(int[] arr, int from) {
            int temp = 0;
            temp = arr[arr.length - 1 - from];
            arr[arr.length - 1 - from] = arr[from];
            arr[from] = temp;
            if (arr.length / 2 - 1 == from)
                return;
            reverse(arr, from + 1);
        }
        public static boolean isPalindrom(String s) {
                char[] S;
                S = s.toCharArray();
                if (S[S.length - 1] != S[0])
                    return false;
                if (S.length / 2 == 1)
                    return true;
                char[] S2 = Arrays.copyOfRange(S, 1, S.length-1);
                s = String.valueOf(S2);
                return isPalindrom(s);
            }
    }
    public static void main(String[] args) {

        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fiboI(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factI(12));
        System.out.println(FuncStat.gcdR(12125,40643));
        System.out.println(FuncStat.gcdI(12125,40643));
        int[] a = { 3, 8, 2, 9, 7, 4, 8 };
        System.out.println("Max : " + FuncStat.maxElem(a, 0));
        System.out.println("Num even: " + FuncStat.numEven(a, 0));
        System.out.println("Before: " + Arrays.toString(a));
        FuncStat.reverse(a, 0);
        System.out.println("After : " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " +
                FuncStat.isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom? " +
                FuncStat.isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " +
                FuncStat.isPalindrom("rover"));
    }

}
