/*
Roman Number to Integer
************************
https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1?page=1&category[]=Strings&sortBy=submissions
*/

class Solution {
    public int romanToDecimal(String str) {
 
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

      
        for (int i = str.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(str.charAt(i));

           
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}