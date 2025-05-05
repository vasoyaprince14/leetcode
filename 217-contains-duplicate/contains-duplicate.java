class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> set= new HashMap<>();
        for(int i:nums){
            if(set.containsKey(i) && set.get(i)>=1){
                return true;
            }
            set.put(i,set.getOrDefault(i,0)+1);
        }
        return false;
    }
}