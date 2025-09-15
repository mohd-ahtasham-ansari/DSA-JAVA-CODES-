import java.util.Arrays;
import java.util.Scanner;

public class rotation_of_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the element to be rotated: ");
        int r= sc.nextInt();
        r %=n;
        rev(arr,0,n-r-1);
        rev(arr,n-r,n-1);
        rev(arr,0,n-1);
        System.out.print("After rotating array: ");
        System.out.println(Arrays.toString(arr));

    }

    static void rev(int arr[],int i, int j){
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

