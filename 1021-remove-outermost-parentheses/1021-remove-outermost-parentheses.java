class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder res = new StringBuilder();
        int depth = 0;

        for(char c : s.toCharArray()){

            if(c == '('){
                if(depth > 0){
                    res.append(c);
                }
                depth++;
            } 
            else {
                depth--;
                if(depth > 0){
                    res.append(c);
                }
            }
        }

        return res.toString();
    }
}