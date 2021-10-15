// GFG Easy array question
// question link :- https://practice.geeksforgeeks.org/problems/multiply-left-and-right-array-sum1555/1
public class MultiplyleftRightSumArray {
    public static int multiply(int[] arr, int n){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n/2; i++) {
            sum1 += arr[i];
        }
        for (int j = n/2; j < n; j++) {
            sum2+= arr[j];
        }
        return sum1*sum2;
    }

    public static void main(String[] args) {
        int[] a = {4,5,6};
        int n = 3;
        int result = multiply(a,n);
        System.out.println(result);
    }
}
