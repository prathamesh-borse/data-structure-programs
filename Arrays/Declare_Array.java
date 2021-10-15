public class Declare_Array{
public static void main(String[] args){
int arr[]; // declaring an array
arr = new int[3]; // initializing an array
arr[0] = 1; // assigning values to the array // from here memory is created for this array
arr[1] = 10; // assingning values to the array
arr[2] = 5; // assingning values to the array
System.out.println(arr[1]); // printing the values of an array from index 1
System.out.println(arr[0]); // printing the values of an array from index 0
System.out.println(arr[2]); // printing the values of an array from index 2

String[] arr1 = new String[5]; // declaring and initializing an array
arr1[0] = "Prathamesh"; 
arr1[1] = "Bhavesh"; 
arr1[2] = "Sanjay"; 
arr1[3] = "Borse"; 
arr1[4] = "Sarala";
System.out.println(arr1[1]);
System.out.println(arr1[2]);
System.out.println(arr1[3]);

System.out.print(arr1[1] + " " + arr1[2] + " " + arr1[3]);  
}
}