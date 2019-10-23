// Problem #3 
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        int len = s.length(); 
        int i = 0;
        int j = 0;
        int maxsublen = 0; 
        Set<Character> subset = new HashSet<Character>();
        
        while(i<len &&j<len){
            
            if(subset.contains(s.charAt(j))){
                
                subset.remove(s.charAt(i));
                i++;
                
            }
               
               else{
                   
                   subset.add(s.charAt(j));
                   j++; 
                   maxsublen = Math.max(maxsublen, j-i);
                   
                   
               }
            
            
            
            
        }
        
        return maxsublen;
     
    }
}