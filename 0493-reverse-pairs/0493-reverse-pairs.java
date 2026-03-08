class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);

        // Count reverse pairs
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long)nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }

        // Merge two sorted halves
        merge(nums, left, mid, right);
        return count;
    }

    private void merge(int[] nums, int left, int mid, int right) {
        List<Integer> temp = new ArrayList<>();
        int i = left, j = mid + 1;

        // Merge two sorted arrays
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp.add(nums[i++]);
            } else {
                temp.add(nums[j++]);
            }
        }

        while (i <= mid) temp.add(nums[i++]);
        while (j <= right) temp.add(nums[j++]);

        // Copy sorted temp back to nums
        for (int k = 0; k < temp.size(); k++) {
            nums[left + k] = temp.get(k);
        }
    }
}
