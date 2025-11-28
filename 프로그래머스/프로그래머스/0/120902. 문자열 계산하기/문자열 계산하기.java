import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringTokenizer st=new StringTokenizer(my_string);
        String input;
        answer=Integer.parseInt(st.nextToken());
        while(st.hasMoreTokens()){
            input=st.nextToken();
             if(input.equals("+")){
                 input=st.nextToken();
                 answer+=Integer.parseInt(input);
            } else{
                 input=st.nextToken();
                 answer-=Integer.parseInt(input);
            } 
        }
        return answer;
    }
}