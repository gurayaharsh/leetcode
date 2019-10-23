//Problem #14 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int numWords = strs.length;
        
        if(numWords>1 && numWords!=0){
            
            String prefix = new String();
        
            
            for(int i = 0; i<strs[0].length(); i++){
                
                char add = strs[0].charAt(i);
                
                for(int j=1; j<numWords; j++){
                    
                    if(strs[j].length()<=i){
                        return prefix; 
                    }
                    
                    else{
                        if(strs[j].charAt(i)!= add){
                          return prefix;
                        }
                        
                    }
                }
                
                prefix += add; 
            }
            
            return prefix;
            
        }
        
        else{
          if(strs.length == 1){
            return strs[0];
          }
            else{
                return new String();
            }   
        }
        

        
    }
}