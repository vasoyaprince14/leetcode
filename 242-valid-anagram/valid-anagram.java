class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i<s.length(); i ++){
            char ch = s.charAt(i);
            map.put(s.charAt(i),map.getOrDefault(ch,0)+1);
        }
        for(int i = 0 ; i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(t.charAt(i))|| map.get(ch)==0){
                return false;
            }

            map.put(t.charAt(i),map.get(t.charAt(i))-1);
        }
        return true;
    }

}