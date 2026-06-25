class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> res = new HashMap<>();

        for(String s : strs){
            int[] arr = new int[26];
            for(char c : s.toCharArray()){
                arr[c - 'a']++;
            }
            String key = Arrays.toString(arr);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);
        }
        System.out.println(res.values());
        System.out.println(new ArrayList<>(res.values()));
        return new ArrayList<>(res.values());
    }
}
