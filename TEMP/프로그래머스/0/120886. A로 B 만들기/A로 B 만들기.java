import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char chb[]=before.toCharArray();
        char cha[]=after.toCharArray();
        Arrays.sort(chb);
        Arrays.sort(cha);
        for(int i=0;i<before.length();i++){
            if(chb[i]!=cha[i])
                return 0;
        }
        return answer;
    }
}