class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}


//TLE


class Solution {
    public int countPrimes(int n) {
        int noofprime = 0;

        if(n <= 2){
            return 0;
        }

        for(int num = 2; num < n; num++){
            boolean isprime = true;

            for(int i = 2; i*i <= num; i++){
                if(num%i == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                noofprime++;
            }
        }

        return noofprime;
    }
}
