class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;

        do{
             s = square(s);
             f = square(square(f));

        }while(s!=f);

        return s == 1;
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