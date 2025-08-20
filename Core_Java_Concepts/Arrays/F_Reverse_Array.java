import java.util.Scanner;

public class F_Reverse_Array{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        //Enter the Size of the Array
        System.out.println("Enter the size of the Array");
        int N = sc.nextInt();

        //Initialize the Array
        int arr[] = new int[N];

        //Scan the Entered Array Element
        System.out.println("Enter the Element of the Array");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");

        //Print the Original Array
        System.out.println("Print the Original Array");
        for(int i = 0; i < N; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");

        //Reverse the Array
        System.out.println("Reversed Array");
        for(int i = N - 1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}