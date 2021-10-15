// GFG Easy question :- Rotate Array
// question Link:- https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

public class RotateArrayGFG {
    
    public static void rotateArray(int[] arr, int n, int d){
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[j] = arr[j + 1];
                arr[j+1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N = 10;
        int D = 3;
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        rotateArray(arr, N, D);
    }
}
