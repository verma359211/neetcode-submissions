class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0, start = 0, result = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            count[c - 'A']++;
            maxCount = Math.max(maxCount, count[c - 'A']);

            // window invalid: shrink by one from the left
            if (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}