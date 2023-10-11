/*Remove Duplicates
*****************
https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1?page=2&category[]=Strings&sortBy=submissions
*/
class Solution {
    String removeDups(String S) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                result.append(currentChar);
            }
        }
        
        return result.toString();
    }
}
