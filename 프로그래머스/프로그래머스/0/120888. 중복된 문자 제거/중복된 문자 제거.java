
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch[]=my_string.toCharArray();
        answer+=ch[0];
        int cnt=0;
        for(int i=0;i<ch.length;i++){
            char c[]=answer.toCharArray();
            for(int j=0;j<c.length;j++){
                if(ch[i]==c[j]){
                    cnt++;
                    break;
                }
            }
            if(cnt==0)
                answer+=ch[i];
            cnt=0;
        }
        return answer;
        
    }
}