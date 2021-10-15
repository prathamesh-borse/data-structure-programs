// GFG Easy Array question
// question link :- https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1/?category[]=Arrays&category[]=Arrays&difficulty[]=0&page=1&query=category[]Arraysdifficulty[]0page1category[]Arrays

public class SumofArrayElements {
    public static int sumofArrayElements(int[] arr, int n){
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = 4;
        int result = sumofArrayElements(arr ,n);
        System.out.println(result);
    }
}
