class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suf = new int[nums.length];
        int[] pre = new int[nums.length];
        suf[0] = 1;
        pre[nums.length-1] = 1;
        int s = 1;
        for(int i = 1; i < suf.length;i++){
            suf[i] = nums[i-1] * s;
            s = suf[i];
        }
        int p = 1;
        for(int i = pre.length-2; i >= 0; i--){
            pre[i] = nums[i+1] * p;
            p = pre[i];
        }
        int[] res = new int[nums.length];
        for(int i = 0; i<nums.length;i++){
            res[i] = suf[i] * pre[i];

        }        
        return res;
    }
}  
