// GFG Easy array question - Need Some Change
// question Link :- https://practice.geeksforgeeks.org/problems/need-some-change/1

public class Swapiandi2Element {
    public static void swapiandi2Element(int[] arr, int n){

        for (int i = 0; i <n-2; i++) {
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
//        System.out.println(); // does not need for adding in the Program
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        swapiandi2Element(arr, n);
    }
}
