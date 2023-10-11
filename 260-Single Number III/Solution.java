class Solution {
    public int[] singleNumber(int[] nums) {
        
        int[] res=new int[2];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int k=0;
        for(int key:map.keySet()){
            if(map.get(key)==1){
                res[k++]=key;
            }
        }
        return res;
    }
}