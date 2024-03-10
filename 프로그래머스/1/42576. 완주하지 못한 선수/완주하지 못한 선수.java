import java.io.*;
import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int cnt=0;
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer=participant[i];
                cnt++;
                break;
            }
        }
        if(cnt==0)
            answer=participant[participant.length-1];
        return answer;
    }
}