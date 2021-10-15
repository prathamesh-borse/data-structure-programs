public class TraversingtwoDimensionarray{
public static void main(String[] args){
int[][] twoDimensionalArray;
twoDimensionalArray = new int[3][3];
twoDimensionalArray[0][0] = 30;
twoDimensionalArray[0][1] = 20;
twoDimensionalArray[0][2] = 10; 

twoDimensionalArray[1][0] = 34;
twoDimensionalArray[1][1] = 24;
twoDimensionalArray[1][2] = 56; 

twoDimensionalArray[2][0] = 56;
twoDimensionalArray[2][1] = 45;
twoDimensionalArray[2][2] = 43; 

for(int row=0;row<twoDimensionalArray.length;row++){
for(int col=0;col<twoDimensionalArray[row].length;col++){
// System.out.print(twoDimensionalArray[row][col] + " ");
}
// System.out.println("\n");
}

// String Two Dimensional Array 
String[][] TwodimensionalArray = new String[2][2];
TwodimensionalArray[0][0] = "Prathamesh";
TwodimensionalArray[0][1] = "Borse";
TwodimensionalArray[1][0] = "Bhavesh";
TwodimensionalArray[1][1] = "Borse";

for(int row=0;row<TwodimensionalArray.length;row++){
for(int col=0;col<TwodimensionalArray[row].length;col++){
System.out.print(TwodimensionalArray[row][col] + " ");
}
System.out.println("\n");
}


}
}