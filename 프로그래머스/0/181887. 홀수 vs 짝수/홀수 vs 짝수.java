class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum_left=0;
        int sum_right=0;
        for(int i=0;i<num_list.length;i++){
            if(i%2==0)
                sum_left+=num_list[i];
            else
                sum_right+=num_list[i];
        }
        if(sum_left<sum_right)
            answer=sum_right;
        else
            answer=sum_left;
        return answer;
    }
}