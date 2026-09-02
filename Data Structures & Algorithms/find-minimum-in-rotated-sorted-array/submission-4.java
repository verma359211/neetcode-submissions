class Solution {
    public int findMin(int[] nums) {
        int r = nums.length - 1;
        int l = 0;
        int m = l + (r-l)/2;
        while(l<r){
            if(nums[m] > nums[r] ){
                l = m+1;
            }
            else{
                r = m;
            }
            m = l + (r-l)/2;
        }
        return nums[m];
    }
}
