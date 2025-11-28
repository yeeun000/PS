class Solution {
    public int solution(int n) {
        int answer = 0;
        answer=6*n/gcd(n,6);
        return answer/6;
    }
    int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}