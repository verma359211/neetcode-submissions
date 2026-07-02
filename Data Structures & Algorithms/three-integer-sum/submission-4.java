class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length ; i++){
            int j = i;
            int k = nums.length - 1; 
            while(j < k){
                if(j == i){
                    j++;
                    continue;
                }
                if(k == i){
                    k--;
                    continue;
                }
                // System.out.println("for index"+i+"value"+nums[i]);
                // System.out.println("we have index:"+j+""+k+""+i+"value:"+nums[j]+" "+nums[k]+" "+nums[i]);
                int res = nums[j] + nums[k] + nums[i];
                // System.out.println(res);
                if(res == 0){
                    list.add(List.of(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                if(res > 0)k--;
                if(res < 0)j++;
            }
        }
        List<List<Integer>> res = new ArrayList<>(list);
        return res;
    }
}
