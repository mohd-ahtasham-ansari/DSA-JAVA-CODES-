import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasicsofJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.print("the arraylist is: ");
        System.out.println(arr);
        //or we can print the arraylist using for each loop
        System.out.println("print the arraylist using for each loop");
       for(int ele : arr){
           System.out.print(ele+" ");
       }
        System.out.println();
        // or we can print the arraylist using for loop
        System.out.println("print the arraylist using for loop");
        for (int i = 0; i <arr.size() ; i++) {
            System.out.print(arr.get(i)+" ");
        }

        //insert any elemet in between the arraylist
        arr.add(2,100);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);

        System.out.println("reverse arraylist using collection.reverse()");
        Collections.reverse(arr);

    }
}
