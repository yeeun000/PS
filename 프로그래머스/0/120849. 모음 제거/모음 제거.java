class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch[]=my_string.toCharArray();
        for(int i=0;i<my_string.length();i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                continue;
            answer+=ch[i];
        }
        return answer;
    }
}