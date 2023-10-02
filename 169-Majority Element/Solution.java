class Solution {
    public int majorityElement(int[] nums) {
        
        int ansIndex=0;
        int count=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[ansIndex]==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                ansIndex=i;
                count=1;
            }
        }
        count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[ansIndex]==nums[i]){
                count++;
            }
        }
        
        return count > nums.length/2 ? nums[ansIndex] : -1;
        
    }
}