class Solution {
    public int findMinFibonacciNumbers(int k) {
       List<Integer> fibseries = new ArrayList<>();
       int a = 1;
       int b = 1;
       fibseries.add(a);
       fibseries.add(b);
       while (true) {
            int c = a + b;
            if (c > k) {
                break;
            } else {
                fibseries.add(c);
                a = b;
                b = c;
            }
        }
       int count = 0;

       for (int i = fibseries.size() - 1; i >= 0 && k > 0; i--) {
            if (fibseries.get(i) <= k) {
                k -= fibseries.get(i);
                count++;
            }
        }
        return count;
    }
}
