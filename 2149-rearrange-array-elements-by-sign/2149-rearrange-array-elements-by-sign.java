class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int p_index=0;
        int n_index=1;
        for( int i=0;i<n;i++){
            if(nums[i]<0){
                ans[n_index]=nums[i];
                n_index+=2;
            }
            else{
                ans[p_index]=nums[i];
                p_index+=2;
            }
        }
        return ans;
    }
}