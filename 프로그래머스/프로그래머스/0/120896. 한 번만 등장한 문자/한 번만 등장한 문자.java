import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char ch[]=s.toCharArray();
        int cnt=0;
        Arrays.sort(ch);
        for(int i=1;i<ch.length;i++){
            if(ch[i]!=ch[i-1]){
                if(cnt==0)
                answer+=ch[i-1];
                cnt=0;
            }else{
                cnt++;
            }
            if(i==ch.length-1){
                if(ch[i]!=ch[i-1])
                answer+=ch[i];
            }
        }
        if(ch.length==1)
            answer+=ch[0];
        return answer;
    }
}