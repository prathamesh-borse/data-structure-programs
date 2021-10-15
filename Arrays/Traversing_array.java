public class Traversing_array{
public static void main(String[] args){
int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// In below for loop we have traversed till the length of the array.
//  this for loop will print the elements of an array from index 0 to arr.length - 1 index.
for(int i=0;i<=arr.length;i++){ 
System.out.print(i + " ");
}
System.out.println("\n");

// changed the index value of 4 of an array 
arr[4] = 20;

// traversing the elements till the arr.length - 6 = 0 to 4 from index 0 to index 4 elements will be printed
for(int i=0;i<=arr.length - 6;i++){ 
System.out.print(i + " ");
}
}
}