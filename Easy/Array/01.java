class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int i=1;
        for(int n:nums){
            if(n>nums[i-1]){
                nums[i]=n;
                i++;
            }
        }
        return i;
    }
}