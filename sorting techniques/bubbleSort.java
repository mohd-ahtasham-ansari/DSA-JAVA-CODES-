public class bubbleSort {
       public static void print(int [] arr){
            int len=arr.length;
            for(int i=0;i<=len-1;i++){
                System.out.println(arr[i]);
            }
        }
    public static void main(String[] args) {
     int[] arr={-0,-2,4,7,3};
     int n=arr.length;
     for(int j=1;j<n-1;j++){
         for(int i=0;i<n-1;i++){
         if (arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i]=temp;
         }
     }
     }
     print(arr);
    }
}
