class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans1 = new HashSet<>();
        for(int i =0; i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j = 0 ; j<nums2.length;j++){
            if(set.contains(nums2[j])){
                ans1.add(nums2[j]);
            }
        }
        int[] ans = new int[ans1.size()];

        int index = 0;
        for(int num : ans1){
            ans[index] = num;
            index++;
        }
        return ans;


    }
}