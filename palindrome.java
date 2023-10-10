
/*
Palindrome String
https://practice.geeksforgeeks.org/problems/palindrome-string0817/0
*/
class Solution {
    int isPalindrome(String S) {
        int first = 0;
        int last = S.length()-1;
        while(first<last){
            if(S.charAt(first)!=S.charAt(last)){
                return 0;
            }
            first++;
            last--;
        }
        return 1;
    }
};