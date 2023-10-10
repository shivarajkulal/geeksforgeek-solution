/*
Parenthesis Checker
*******************
Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).
*/
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : x.toCharArray()){
            if(c=='(' || c=='['  || c=='{'){
                 stack.push(c);    
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(c==')' && top!='(' || c==']' && top!='[' ||c=='}' && top!='{' ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
