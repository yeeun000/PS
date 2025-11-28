class Solution {
    public String solution(int age) {
        String answer = "";
        String s= String.valueOf(age);
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            answer+=(char)(ch[i]+49);
        }
        return answer;
    }
}