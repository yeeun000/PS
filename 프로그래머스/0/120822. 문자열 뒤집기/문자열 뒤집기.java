class Solution {
    public String solution(String my_string) {
        String answer = "";
        char ch[]=my_string.toCharArray();
        for(int i=my_string.length()-1;i>-1;i--){
            answer+=ch[i];
        }
        return answer;
    }
}