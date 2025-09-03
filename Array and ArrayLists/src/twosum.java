import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 4, 8, 9, 5};
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] ==target) {
                    System.out.println(arr[i]+ " " + arr[j]);
                }
            }

        }
    }
}
