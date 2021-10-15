// GFG Easy array question
// question link :- https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

public class Max_MinofArray {
    public static long MinArray(long[] a, long n){
        long min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    public static long maxArray(long[] a, long n){
        long max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        long n = 5;
        long[] arr = {1,345,234,21,56789};
        long result = maxArray(arr,n);
        long result2 = MinArray(arr,n);
        System.out.print("min = " + result2 + ", " + " max = " + result);
    }
}
