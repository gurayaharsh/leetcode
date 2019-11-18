// Problem 26 

class Solution {
    public int removeDuplicates(int[] nums) {
        
        // First element is definately unique 
        
        int i=0;
        
        // Loop through all ahead elements, if they are same just keep moving j
        // If they aren't the same then put that element at the index after the last unique one 
        
        for(int j=0; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j]; 
            }
        }
        
        return i + 1; 
    }
}