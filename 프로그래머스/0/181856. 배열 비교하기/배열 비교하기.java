class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length<arr2.length)
            answer=-1;
        else if(arr1.length==arr2.length){
            int sum_1=0;
            int sum_2=0;
            for(int i=0;i<arr1.length;i++){
                sum_1+=arr1[i];
                sum_2+=arr2[i];
            }
            if(sum_1<sum_2)
                answer=-1;
            else if(sum_1==sum_2)
                answer=0;
            else
                answer=1;
        }
        else
            answer=1;
        return answer;
    }
}