class Solution {
    public int splitArray(int[] nums, int k) {

        int s = 0;
        int e = 0;

        for (int i : nums){
            s = Math.max(i,s);
            e += i;
        }

        while(s<e){
            int mid = s + (e-s)/2;
            int sum = 0;
            int pieces = 1;

            for(int i :nums){
                if(sum + i >mid){
                    pieces++;
                    sum = i;
                }
                else{
                    sum +=i;
                }
            }
            if (pieces > k){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }

        return e;
        
    }
}