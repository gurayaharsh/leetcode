//Problem #14 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = "";
        for(int i=0; i<strs[0].length(); i++){
            char letter = strs[0].charAt(i);
            for(String word: strs){
                if(i>word.length() -1 || word.charAt(i) != letter){
                    return prefix;
                }
            }
            
            prefix+= letter;
        }
        
        return prefix;
    }
}