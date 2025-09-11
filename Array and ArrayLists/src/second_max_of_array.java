import java.util.Scanner;

public class second_max_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        int max = arr[0];
        for (int i = 0; i <n ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the largest element of the array is : "+max);
        int secondMax = arr[0];
        for (int i = 0; i <n ; i++) {
            if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];

            }
        }
        System.out.println("the second largest element of array is :"+secondMax);
    }

}
