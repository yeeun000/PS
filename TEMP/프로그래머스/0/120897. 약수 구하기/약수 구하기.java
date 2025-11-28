class Solution {
    public int[] solution(int n) {
        int[] answer;
        int []cnt=new int [n];
        int p=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt[p]=i;
                p++;
            }
        }
        answer=new int [p];
        for(int i=0;i<p;i++){
            answer[i]=cnt[i];
        }
        return answer;
    }
}