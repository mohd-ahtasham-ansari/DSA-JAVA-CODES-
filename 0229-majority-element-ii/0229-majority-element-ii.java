class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;int cnt2=0;
        int ele1=0;int ele2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                cnt1++;
            }
            else if(nums[i]==ele2){
                cnt2++;
            }
            else if(cnt1==0){
                ele1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0){
                ele2=nums[i];
                cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        //verify part 
         cnt1=0;
         cnt2=0;
        for(int num :nums){
            if(num==ele1){cnt1++;}
            else if(num==ele2){cnt2++;}
        }
       List<Integer> result=new ArrayList<>();
       if(cnt1>nums.length/3){result.add(ele1);}
       if(cnt2>nums.length/3){result.add(ele2);}

       return result;
    }
}