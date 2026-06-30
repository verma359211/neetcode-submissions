class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length;

        while(i < j){
            int sum = numbers[i] + numbers[j -1] ;
            if(sum > target){
                j--;
            }
            else if(sum < target){
                i++;
            }else{
                return new int[]{i+1,j};
            }
        }
        return new int[]{0,0};
    }
}
