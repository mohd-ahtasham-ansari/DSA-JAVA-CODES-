public class Merge2SortedArrayTechnique2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int ele : arr3) System.out.print(ele +" ");
        System.out.println();
        int i = arr1.length-1;int j = arr2.length-1;int k = arr3.length-1;
        while (i >= 0 && j >=0) {
            if (arr1[i] > arr2[j]) {
                arr3[k--] = arr1[i--];
            } else {
                arr3[k--] = arr2[j--];
            }
        }
        while(i>=0){
            arr3[k--]=arr1[i--];
        }
        while(j>=0) {arr3[k--]=arr2[j--];}
        for(int ele : arr3) System.out.print(ele +" ");
        System.out.println();
    }
}
