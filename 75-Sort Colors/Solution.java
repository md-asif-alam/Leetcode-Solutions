class Solution {
    public void sortColors(int[] nums) {
        
        int cntZero=0;
        int cntOne=0;
        int cntTwo=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cntZero++;
            }
            if(nums[i]==1){
                cntOne++;
            }
            if(nums[i]==2){
                cntTwo++;
            }
        }
        
        int i=0;
        while(cntZero>0){
            nums[i++]=0;
            cntZero--;
        }
        
         while(cntOne>0){
            nums[i++]=1;
            cntOne--;
        }
        
         while(cntTwo>0){
            nums[i++]=2;
            cntTwo--;
        }
    }
}