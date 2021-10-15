// GFG Easy question
// question link :- https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1

public class LargestElementInArray {
    public static int largestElementInarray(int[] arr, int n){
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,8,7,56,90};
        int result = largestElementInarray(arr, n);
        System.out.println(result);
    }
}
