class Solution {
    public int romanToInt(String s) {
        HashMap <Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int pev=0;
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            int value=map.get(s.charAt(i));
            if(pev>value){
                System.out.println(s.charAt(i)+" " + pev +" "+ sum);
                sum-=value;
            }
            else{
                sum+=value;
                System.out.println(s.charAt(i)+" " + pev +" "+ sum);
            }
            System.out.println(s.charAt(i)+" " + pev +" "+ sum);
            pev=value;
        }

        return sum;
    }
}