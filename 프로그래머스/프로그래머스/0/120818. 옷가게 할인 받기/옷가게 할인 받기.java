class Solution {
    public int solution(int price) {
        int answer = 0;
        double sale=0;
        if(price>=500000)
            sale=(double)price*0.2;
        else if(price>=300000)
            sale=(double)price*0.1;
        else if(price>=100000)
            sale=(double)price*0.05;
        answer=(int)(price-sale);
        return answer;
    }
}