import java.util.Scanner;

public class countandsortZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
            for (int j = 0; j <count ; j++) {
                arr[j]=0;
            }
            for (int j = count; j <n ; j++) {
                arr[j]=1;
            }
        }
    }
}
