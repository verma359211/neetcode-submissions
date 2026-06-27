class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int count = 0;
        for(int s : set){
            if(set.contains(s-1)) continue;
            int length = 1;
            while(set.contains(s+length)){
                length++;
            }
            count = Math.max(count,length);
        }
        return count ;
    }
}
