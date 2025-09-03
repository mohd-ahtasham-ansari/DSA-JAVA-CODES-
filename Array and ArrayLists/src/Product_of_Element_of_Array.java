public class Product_of_Element_of_Array {

    public static void main(String[] args) {
        int [] arr= {1, -2, 4,-9,10,6,5};
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
