// Time Limit Exceeded

class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        List<Long> products = new ArrayList<>();
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                products.add((long) nums1[i] * nums2[j]);
            }
        }

        Collections.sort(products);
        
        return products.get((int)k - 1);
    }
}
