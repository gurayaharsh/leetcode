// Problem #204

class Solution {
    public int countPrimes(int n) {
     
        
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        int primeCount = 0;
        
        for(int i=2; i * i < n; i++){
            if(primes[i]){
               for(int j=i; i * j < n; j++){
                   primes[i * j] = false;
               }
            }
        }
        
        for(int k=2; k<n; k++){
            if(primes[k]){
                primeCount++;
            }
        }
        
        return primeCount;
        
    }
}