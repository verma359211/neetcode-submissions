// class Solution {
//     public String minWindow(String s, String t) {
//         HashSet<Character> set = new HashSet<>();
//         for(char ch : t.toCharArray()){
//             set.add(ch);
//         }
//         HashMap<Character, Integer> tmap = new HashMap<>();
//         for(char ch : t.toCharArray()){
//             tmap.put(ch, tmap.getOrDefault(ch, 0) +1);
//         }
//         String ss=null;
//         for(int i = 0; i < s.length(); i++){
//             if(set.contains(s.charAt(i))){
//                 int j = i+t.length();
//                 while(j<=s.length()){
//                     String temp = s.substring(i,j);
//                     // System.out.println(temp);
//                     HashMap<Character, Integer> map = new HashMap<>();
//                     for(char c : temp.toCharArray()){
//                         map.put(c, map.getOrDefault(c, 0) +1);
//                     }
//                     boolean check = true;
//                     for(char che : tmap.keySet()){
//                         if(tmap.get(che) > map.getOrDefault(che,0)){
//                             check = false;
//                         }
//                     }
//                     if(check){
//                         if(ss == null || temp.length() < ss.length()){
//                             ss = temp;
//                             // System.out.println("ss updated: "+ss);
//                         }
//                         break;
//                     }
//                     j++;
//                 }
//             }
//         }
//         if(ss == null){
//             return "";
//         }
//         else{
//             return ss;
//         }
//     }
// }
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int required = t.length(); // total remaining chars still needed
        int left = 0;
        int bestLen = Integer.MAX_VALUE;
        int bestStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (need[c] > 0) {
                required--;
            }
            need[c]--; // can go negative for chars we have "extra" of

            while (required == 0) {
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestStart = left;
                }
                char lc = s.charAt(left);
                need[lc]++;
                if (need[lc] > 0) {
                    required++;
                }
                left++;
            }
        }

        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}