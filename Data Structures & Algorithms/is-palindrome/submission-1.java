class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                newStr.append(Character.toLowerCase(ch));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
