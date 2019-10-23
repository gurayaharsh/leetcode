// Problem #1 

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        
        for(int i =0; i<nums.length; i++){
            
            int comp = target - nums[i];
            
            if(memo.containsKey(comp)){
                ans = new int[]{memo.get(comp),i};
                return ans;
            
            }
            
            else{
                memo.put(nums[i],i);
            }
            
        }
        
        return ans;
        
    }
}