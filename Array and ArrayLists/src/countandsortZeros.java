import java.util.Arrays;
import java.util.Scanner;
//segregation of 0's and 1's'
public class countandsortZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array {[( only zeros and ones )]}: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
            for (int j = 0; j <count ; j++) {
                arr[j]=0;
            }
            for (int j = count; j <n ; j++) {
                arr[j]=1;
            }
        System.out.println(Arrays.toString(arr));
    }
}
