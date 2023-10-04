class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int num1=-1;
        int num2=-1;
        int count1=0;
        int count2=0;
        int len=nums.length;
        
        for(int i=0;i<len;i++){
            if(nums[i]==num1){
                count1++;
            }else if(nums[i]==num2){
                count2++;
            }else if(count1==0){
                num1=nums[i];
                count1=1;
            }else if(count2==0){
                num2=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        
        List<Integer> list=new ArrayList<>();
        count1=0;
        count2=0;
        for(int i=0;i<len;i++){
            if(num1==nums[i]){
                count1++;
            }else if(num2==nums[i]){
                count2++;
            }
        }
        
        if(count1>len/3)
            list.add(num1);
        if(count2>len/3)
            list.add(num2);
        
        return list;
        
    }
}