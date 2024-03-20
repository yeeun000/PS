class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int a=code-1;
        char ch[]=cipher.toCharArray();
        while(cipher.length()>a){
            answer+=ch[a];
            a+=code;
        }
        return answer;
    }
}