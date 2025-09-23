import java.util.*;

    public class AddingONE {
        Vector<Integer> addOne(int[] arr) {
            int n = arr.length;
            Vector<Integer> ans = new Vector<>();
            int carry = 1;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] + carry <= 9) {
                    ans.add(arr[i] + carry);
                    carry = 0;
                } else {
                    ans.add(0);
                    carry = 1;
                }
            }
            if (carry == 1) {
                ans.add(1);
            }
            Collections.reverse(ans);
            return ans;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            AddingONE obj = new AddingONE();
            Vector<Integer> result = obj.addOne(arr);
            for (int x : result) {
                System.out.print(x + " ");
            }
        }
    }


