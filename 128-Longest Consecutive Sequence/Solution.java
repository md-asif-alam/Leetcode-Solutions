class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean> map=new HashMap<>();
        
        for(int ele:nums){
            map.put(ele,true);
        }
        
        for(int val:nums){
            if(map.containsKey(val-1)){
                map.put(val,false);
            }
        }
        
        int ml=0;
        for(int val:nums){
            if(map.get(val)==true){
                int tl=1;
                while(map.containsKey(val+tl)){
                    tl++;
                }
                
                if(tl>ml){
                    ml=tl;
                }
            }
        }
        
        return ml;
        
    }
}