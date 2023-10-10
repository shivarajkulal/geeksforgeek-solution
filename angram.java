/*
Anagram
*********************
https://practice.geeksforgeeks.org/problems/anagram-1587115620/1?page=1&category[]=Strings&sortBy=submissions

*/
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        if(a.length()!=b.length()){
            return false;
        }
        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();
        Arrays.sort(a_arr);
        Arrays.sort(b_arr);
  
        if(Arrays.equals(a_arr,b_arr)){
            return true;
        }
        else
          return false;
    }
}