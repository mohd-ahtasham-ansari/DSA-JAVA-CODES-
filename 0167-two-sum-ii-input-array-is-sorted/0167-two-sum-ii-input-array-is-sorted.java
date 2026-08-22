class Solution {
    public int[] twoSum(int[] nums, int target) {
       int i=0;
       int j=nums.length -1;
       while(i<j){
        if(nums[i]+nums[j]== target){
            return new int[]{i+1,j+1};
        }
        else if(nums[i]+nums[j]>target){
            j--;
            continue;
        }
        else if(nums[i]+nums[j]<target){
            i++;
            continue;
       } 
       i++;}
       return new int[]{-1,-1};
    }
}