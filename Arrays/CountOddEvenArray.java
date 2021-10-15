// GFG Easy Array question
// question link :- https://practice.geeksforgeeks.org/problems/count-odd-even/1/?category[]=Arrays&category[]=Arrays&difficulty[]=0&page=2&query=category[]Arraysdifficulty[]0page2category[]Arrays


public class CountOddEvenArray {
    public static void countOddEven(int[] arr, int n){
        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount += 1;
            }else {
                oddCount += 1;
            }
        }
        System.out.println(evenCount + " " + oddCount);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 5;

        countOddEven(arr, n);
    }
}
