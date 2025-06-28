import java.util.Scanner;

public class Seperate_Even_Odd_Array {
    public static void main(String[] args){
     //Declare the Scanner Class Object
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the Arrya");
     //Enter the Size of the Array
     int N = sc.nextInt();

     //Declare the Array
     int arr[] = new int[N];
     System.out.println("Enter the array Elements");

     //Scanning User Inputs 
    //if we do not scan the Input through
    //for Loop it will print the empty array
    //of respective input size    
    for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();    
            System.out.print(arr[i] + " ");
        }

     //Implement Logic to filter Out Even/Odd
     System.out.println(" ");
     System.out.println("\nEven Numbers:");
    for (int i = 0; i < N; i++) {
    if (arr[i] % 2 == 0) {
        System.out.print(arr[i] + " ");
    }
}

    System.out.println("\n\nOdd Numbers:");
    for (int i = 0; i < N; i++) {
    if (arr[i] % 2 != 0) {
        System.out.print(arr[i] + " ");
    }
}
     sc.close();
    }

 //Even Odd will require Two Loops as we need to iterate Array to seperate Even and Odd
 //Outputs   
       
}
