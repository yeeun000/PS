import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        int max=0;
        int min=0;
        int cnt=0;
        if(array[0]>n)
            answer=array[0];
        else if(array[array.length-1]<n)
            answer=array[array.length-1];
        else{
            for(int i=0;i<array.length;i++){ 
                if(array[i]<n)
                    min=array[i];
                else{
                    max=array[i];
                    break;
                }
            }
            if(max-n<n-min)
                answer=max;
            else
                answer=min;
        }
        
        return answer;
    }
}