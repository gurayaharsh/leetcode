// Problem #7

class Solution {
    public int reverse(int x) {
        
        int lsd = 0;
        int revint = 0; 
        
        while(x!=0){
            
            lsd = x%10; 
            x = x/10;
            
          if (revint > Integer.MAX_VALUE/10 || (revint == Integer.MAX_VALUE / 10 && lsd > 7)) return 0;
            if (revint < Integer.MIN_VALUE/10 || (revint == Integer.MIN_VALUE / 10 && lsd < -8)) return 0;
               
        revint = (revint*10) + lsd;
        
                
            } 
            
           
        
       return revint; 
        
    }
}