class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
               int count = map.get(num);
               map.put(num,count+1);
            }
            else{
                map.put(num,1);
            }
            if(map.get(num)> n){
                return num;
            }
        }
        return -1;
    }
}