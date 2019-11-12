// Problem # 905 

class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int even = 0;
        int odd = A.length-1; 
        int[] paritySort = new int[A.length];
        
        for(int num : A){
            if(num%2 ==0){
                paritySort[even] = num;
                even ++;
            }
            
            else{
                paritySort[odd] = num;
                odd --;
            }
        }
        
        return paritySort;
        
    }
}