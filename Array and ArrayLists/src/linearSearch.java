import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {-7,-5,7,5,4,3,7,7,8,0,2,};
        int key=sc.nextInt();
        int index=0;
        boolean found = false;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==key){
                found = true;
                index=i;
                break;
            }
        }
        if(found){
            System.out.println("Found at "+index);
        }
    }

}