
    import java.util.*;

    public class majority {
        public static List<Integer> majorityElement(int[] nums) {
            Integer candidate1 = null, candidate2 = null;
            int count1 = 0, count2 = 0;

            // Phase 1: Find potential candidates
            for (int num : nums) {
                if (candidate1 != null && num == candidate1) {
                    count1++;
                } else if (candidate2 != null && num == candidate2) {
                    count2++;
                } else if (count1 == 0) {
                    candidate1 = num;
                    count1 = 1;
                } else if (count2 == 0) {
                    candidate2 = num;
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }

            // Phase 2: Verify the candidates
            List<Integer> result = new ArrayList<>();
            int n = nums.length;
            int c1 = 0, c2 = 0;

            for (int num : nums) {
                if (candidate1 != null && num == candidate1) c1++;
                if (candidate2 != null && num == candidate2) c2++;
            }

            if (c1 > n / 3) result.add(candidate1);
            if (c2 > n / 3 && !Objects.equals(candidate1, candidate2)) result.add(candidate2);

            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter elements of array:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // Compute result
            List<Integer> ans = majorityElement(nums);

            // Output
            System.out.println("Majority Elements (> n/3): " + ans);
        }
    }


