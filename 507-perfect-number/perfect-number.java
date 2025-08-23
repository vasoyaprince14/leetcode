class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1;i<num;i++){
            if (num % i == 0){
                // System.out.println(i);
                sum +=i;
                if(sum>num){
                    return false;
                }
            }
        }

        return num == sum;
        
    }
}