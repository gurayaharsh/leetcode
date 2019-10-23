"Problem #20"
class Solution(object):
    
        
        
        
    def isValid(self, s):
        
        """
        :type s: str
        :rtype: bool
        """
        para = [];
        for c in s: 
            if(c == '(' or c == '[' or c == '{'):
                para.append(c)
            else:
                
                if (len(para) == 0): 
                    return false
                
                match = true; 
                
                top = para.pop()
                
                if(top == '{'):
                    match = if(c == '}')
                
                if(top == '['):
                    match = if(c == ']')
                
                if(top == '('):
                    match = if(c == ')')
                if(match == false):
                    return false
                 
        
        return len(para) == 0
        