class Solution {
    public int findMin(int[] nums) {
        int r = nums.length - 1;
        int l = 0;
        int m = 0;
        while(l<r){
            m = l + (r-l)/2;
            System.out.println(m);
            if(nums[m] > nums[r] ){
                l = m+1;
            }
            else{
                r = m;
            }
        }
        return nums[r];
    }
}
