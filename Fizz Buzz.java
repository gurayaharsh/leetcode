// Problem 412

class Solution {
    public List<String> fizzBuzz(int n) {
        
        ArrayList<String> fizzBuzz = new ArrayList<String>();
        
        for(int i=1; i<=n; i++){
            
            if(i%3 == 0 && i%5 ==0){
                fizzBuzz.add("FizzBuzz");
            }
            else if (i%5 == 0){
                fizzBuzz.add("Buzz");
            }
            else if(i%3 == 0){
                fizzBuzz.add("Fizz");
            }
            
            else{
                fizzBuzz.add(String.valueOf(i));
            }
        }
        
        return fizzBuzz;
    }
}