/*
Reverse words in a given string
********************
https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/0
*/

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {  
        String[] words = S.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int j=words.length-1;j>=0;j--){
              sb.append(words[j]); 
              if(j>0){
                  sb.append(".");
              }
        }
        return sb.toString();
    }
}