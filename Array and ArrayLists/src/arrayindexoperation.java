import java.util.Scanner;
public class arrayindexoperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("the original array is: ");
        for (int i = 0; i < n; i++) {
        System.out.println(arr[i]);
        }
        index_op(arr);
        System.out.print("the updated array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void index_op(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] +10;
            }
            else {
                arr[i] = arr[i] *2;
            }
        }
    }
}
