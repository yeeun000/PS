class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str=String.valueOf(num);
        answer=str.indexOf((char)(k+'0'));
        if(answer==-1)
            return answer;
        else
            return answer+1;
    }
}