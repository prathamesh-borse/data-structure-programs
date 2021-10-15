public class Twodimesionalarray{
public static void main(String[] args){
int[][] TwodimensionalArray; //declaring an two dimensional array
// TwodimensionalArray = new int[row][col]; // allocating memory to TwodimensionalArray.
TwodimensionalArray = new int[3][3]; // created 3 row * 3 column array
TwodimensionalArray[0][0] = 1; // assingned value at index = 0,0  same as below 👇
TwodimensionalArray[0][1] = 10;
TwodimensionalArray[0][2] = 20;

TwodimensionalArray[1][0] = 10; // assigned value at index = 1,0 = 10 
TwodimensionalArray[1][1] = 20; // assigned value at index = 1,1 = 20
TwodimensionalArray[1][2] = 30; // assigned value at index = 1,2 = 30

TwodimensionalArray[2][0] = 40; // assigned value at index = 2,0 = 40
TwodimensionalArray[2][1] = 34; // assigned value at index = 2,1 = 34
TwodimensionalArray[2][2] = 345; // assigned value at index = 2,2 = 345
System.out.println(TwodimensionalArray[0][0]); // 1
System.out.println(TwodimensionalArray[1][2]); // 30
System.out.println(TwodimensionalArray[2][2]); // 345


// String Two Array Creation
String[][] userNames;
userNames = new String[2][3]; 

userNames[0][0] = "Prathamesh";
userNames[0][1] = "Bhavesh";
userNames[0][2] = "Sarala";

userNames[1][0] = "Akash";
userNames[1][1] = "Shubhada";
userNames[1][2] = "Diksha";
System.out.println(userNames[0][0]); // Prathamesh
System.out.println(userNames[1][2]); // Diksha
}
}