class Solution {
    public int longestConsecutive(int[] nums) {
        if( nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest=0;
        for (int num: set){
            if(!set.contains(num-1)){
                int currentnum=num;
                int count=1;
                 while(set.contains(currentnum+1)){
                currentnum= currentnum+1;
                count=count+1;
            }
            longest=Math.max(longest,count);

            }
           
        }
        return longest;

    }
}