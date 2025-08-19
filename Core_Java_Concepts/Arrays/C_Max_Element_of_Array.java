import java.util.Scanner;

public class C_Max_Element_of_Array{
    public static void main(String[]args){
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
    //Let suppose the Max Element if First
        int max_element = arr[0];
    //Find Max Elemnt from the List
        for (int i = 1; i < N; i++){
          
            if (arr[i] > max_element){
                max_element = arr[i];
            }
            
        }
        System.out.println( "This is the max Element " +max_element);
        sc.close();

    }
}