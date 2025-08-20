import java.util.Scanner;

public class E_sum_to_addjacent_digit {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
    

        System.out.println("Enter the size of the array");

        int n = sc.nextInt();
        int arr[] = new int[n];



        //Print the input array
        System.out.println("Enter the Element of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+ " ");
        }

        //Wrote down the logic to print the sum of the pair of the two
        //cosecutive number

        //Create the new array

        int new_arr[] = new int[n - 1];

       System.out.println(" ");
       System.out.println("New array with consecutive digits sum");
        for(int i = 0; i < n -1; i++){

            new_arr[i] = arr[i] + arr[i + 1];

            System.out.print(new_arr[i]+ " ");
            sc.close();

        }







        
        

    }
    
}
