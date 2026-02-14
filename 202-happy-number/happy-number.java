class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;

        while(f!=1){
           s = square(s);
            int temp = square(f);
            f= square(temp);
            if(s==f && s != 1){
                return false;
            }            
        }
        return true;
    }

    public int square(int n){
        int ans= 0; 
        while(n!=0){
            int temp = n%10;
            ans += temp* temp;
            n/=10;
        }
        return ans;
    }
}