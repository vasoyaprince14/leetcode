class Solution {
    public boolean isPalindrome(String str) {
        int e = str.length() -1;
        int s = 0;

        while(s<e){
            if(!Character.isLetterOrDigit(str.charAt(s))){
                s++;
            }
            else if (!Character.isLetterOrDigit(str.charAt(e))){
                e--;
            }
            else if (Character.toLowerCase(str.charAt(s))!= Character.toLowerCase(str.charAt(e))){
                return false;
            }
            else{
                s++;
                e--;
            }
        }
        return true;
    }
}