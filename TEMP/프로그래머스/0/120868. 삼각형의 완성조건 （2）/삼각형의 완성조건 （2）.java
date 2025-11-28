class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max=0;
        int min=0;
        if(sides[0]<sides[1]){
            max=sides[1];
            min=sides[0];
        }
        else{
            min=sides[1];
            max=sides[0];
        }
         //x < num1+num2
        for(int i=max;i<max+min;i++){
            answer++;
        }
        System.out.println(answer);
        for(int i=1;i<max;i++){   //num2 < num1+x
            if(max-min<i)
                answer++;
        }
        return answer;
    }
}