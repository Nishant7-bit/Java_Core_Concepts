import java.util.Scanner;

public class Scan_and_print_Elements {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in); //Initialization of Scanner Class Objects
        System.out.println("Enter the size of the array");
        int N = sc.nextInt(); //Scanning all the Elements
        System.out.println("Enter the array Elements");
        int arr[] = new int[N]; //Initialize Array Objects

        //Scanning User Inputs 
        //if we do not scan the Input through
        //for Loop it will print the empty array
        //of respective input size 
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();    
            System.out.print(arr[i] + " ");
        }
         System.out.println(" ");
        //Printing Scanned the User Input
        for(int i = 0; i < N; i++){
            System.out.print(arr[i]+ " ");
        }

        sc.close();
    }
}