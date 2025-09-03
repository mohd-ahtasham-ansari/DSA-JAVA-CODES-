import java.util.*;
public class Min_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min =arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){ min = arr[i];}
        }
        System.out.println("Min element is: "+min);
    }
}
