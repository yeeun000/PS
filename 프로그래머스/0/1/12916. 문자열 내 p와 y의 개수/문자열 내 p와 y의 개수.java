class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char ch[]=s.toCharArray();
        int cnt=0;
        int cnt_y=0;
        for(int i=0;i<s.length();i++){
            if(ch[i]=='P' || ch[i]=='p')
                cnt++;
            else if(ch[i]=='Y' || ch[i]=='y')
                cnt_y++;
        }
        if(cnt==cnt_y)
            answer=true;
        else
            answer=false;
        return answer;
    }
}