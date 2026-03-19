class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];

        // Step 1: Assume all are prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Sieve logic
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}