
import java.util.Scanner;

public class CheckIfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the element of the array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
