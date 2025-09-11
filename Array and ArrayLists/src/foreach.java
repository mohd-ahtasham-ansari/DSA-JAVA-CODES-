import java.util.Arrays;
import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0 ;i < n ;i++){
            arr[i]=sc.nextInt();
        }
        for (int k: arr){
            System.out.print(k+" ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
