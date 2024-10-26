class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for(int i : nums1){
            s1.add(i);
        }
        for(int i : nums2){
            if(s1.contains(i)){
                ans.add(i);
            }
        }

        int result[] = new int[ans.size()];
        int index = 0;
        for(int i : ans){
            result[index++] = i;
        }
        return result;
    }
}
