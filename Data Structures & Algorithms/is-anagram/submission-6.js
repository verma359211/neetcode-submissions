class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length !== t.length){
            return false;
        }
        const map = new Map();
        for(const i of s){
            map.set(i, (map.get(i) || 0) + 1);
        }
        for(const i of t){
            if(!map.has(i)){
                return false;
            }
            map.set(i, map.get(i) - 1);
            if(map.get(i) === 0){
                map.delete(i);
            }
        }
        if(map.size === 0){
            return true;
        }
        return false;

    }
}
