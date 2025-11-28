class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int [emergency.length];
        int cnt=0;
        int value=0;
        while(true){
            if(cnt==emergency.length)
                break;
            int max=0;
            for(int i=0;i<emergency.length;i++){
                if(max<emergency[i]){
                    max=emergency[i];
                    value=i;
                }
            }
            cnt++;
            answer[value]=cnt;
            emergency[value]=0;
        }
        
        return answer;
    }
}