class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String , List> ans = new HashMap<>();
        int count[] = new int [26];

        for(String s : strs){
            Arrays.fill(count,0);
            for(int i = 0 ; i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder("");

            for(int i : count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(s);
        } 

        return new ArrayList(ans.values());
    }
}