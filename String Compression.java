// Problem 443 

class Solution {
    public int compress(char[] chars) {
        
        int i = 0;
        int insert = 0;
        
        while(i<chars.length){
            
            int count = 0;
            char curr = chars[i];
            
            while(i<chars.length && curr == chars[i]){
                count++;
                i++;
            }
            
            chars[insert++] = curr;
            
            if(count!=1){
                for(char num : Integer.toString(count).toCharArray()){
                    chars[insert++] = num;
                }
            }
            
        }
        
         return insert;
    }
}