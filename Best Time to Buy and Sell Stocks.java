//Problem 121

class Solution {
    public int maxProfit(int[] prices) {
        
        
        if(prices == null || prices.length<2){
            return 0; 
        }
        
        int max = 0;
        int minDay = prices[0];
        
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minDay){
                minDay = prices[i];
            }
            else{
                if(prices[i]-minDay>max){
                    max = prices[i]-minDay;
                }
            }
        }
        
        return max;
        
        
        
    }
    
}