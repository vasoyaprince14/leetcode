class Solution {
    public int reverse(int x) {
        int temp =x;
        int last;
        int r=0;
        int max = (int)Math.pow(2,31);
        int min = (int)Math.pow(-2,31);
        while( temp != 0)
        {   last = temp %10;
           if(r>max/10 || (r==max/10 && last>=7)) return 0;
           if(r<min/10  || (r==min/10 && last<=-8))return 0;
            r= r*10;
          
           r= r+last;
           temp =temp /10;
        }
         return r;
    }
}