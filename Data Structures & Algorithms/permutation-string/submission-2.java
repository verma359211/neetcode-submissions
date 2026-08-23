class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }

        HashMap<Character, Integer> s1map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            s1map.put(ch,s1map.getOrDefault(ch,0) + 1);
        } 
        int j = s1.length()-1;
        int i = 0;
        while(j < s2.length()){
            HashMap<Character, Integer> temp = new HashMap<>();
            String s = s2.substring(i,j+1);
            for(char c : s.toCharArray()){
                temp.put(c,temp.getOrDefault(c,0) + 1);
            } 
            if(s1map.equals(temp)){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}
