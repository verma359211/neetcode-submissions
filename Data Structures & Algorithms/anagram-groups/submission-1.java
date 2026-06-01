class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> mainmap = new HashMap<>();

        for(String s : strs){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < s.length();i++){    
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            if(mainmap.containsKey(map)){
                List l1 = mainmap.get(map);
                l1.add(s);   
            }else{
                List<String> l2 = new ArrayList<>();
                l2.add(s);
                mainmap.put(map, l2);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(HashMap<Character, Integer> hmap : mainmap.keySet()){
            res.add(mainmap.get(hmap));
        }

        return res;
    }
}
