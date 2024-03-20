class Solution {
    public String solution(String rsp) {
        String answer = "";
        char ch[]=rsp.toCharArray();
        for(int i=0;i<rsp.length();i++){
            if(ch[i]=='2')
                answer+="0";
            else if(ch[i]=='0')
                answer+="5";
            else
                answer+="2";
        }
        return answer;
    }
}