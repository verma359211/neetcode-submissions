class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> map =  new HashSet<>();
        for(int i = 0;i<s.length();i++){
            map.add(s.charAt(i));
        }
        int max = 0;
        for(char ch : map){
        int kk = k;
        int i = 0;
        // System.out.println("first index: "+i);
        int j = 0;
        while(j < s.length()){
            if(s.charAt(j) == ch){
                // System.out.println("code come here!!");
                j++;
                max = Math.max(j-i,max);
                continue;
            }
            if(kk != 0){
                kk--;
                j++;
                max = Math.max(j-i,max);
                continue;
            }
            if(s.charAt(i) == ch){
                i++;
            }
            else{
                i++;
                kk++;
            }
        }
        }

        return max;
    }
}
