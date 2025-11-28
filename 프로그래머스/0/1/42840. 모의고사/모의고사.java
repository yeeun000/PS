import java.io.*;
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int [] cnt=new int [3];
        int an=1;
        int three[]={3,1,2,4,5};
        for(int i=0;i<answers.length;i++){
            if(an>5)
                an=1;
            if(answers[i]==an){
                cnt[0]++;
            }
            an++;
        }
        an=1;
        for(int i=0;i<answers.length;i++){
            if(an>5)
                an=1;
            if(i%2==0){
                if(answers[i]==2)
                    cnt[1]++;
            }
            else{
                if(answers[i]==an)
                       cnt[1]++;
                an++;
                if(an==2)
                    an++;
            }
            
        }
        an=0;
        for(int i=0;i<answers.length;i++){
            if(i!=0 && i%2==0)
                an++;
            if(an>4)
                an=0;
            if(answers[i]==three[an]){
                cnt[2]++;
            }
        }
        int []max=new int[3];
        if(cnt[0]==cnt[1] && cnt[1]==cnt[2]){
            max[0]=3;
        }
        else if(cnt[0]>cnt[1] && cnt[0]>cnt[2]){
            max[0]=1;
            max[1]=1;
        }
        else if(cnt[1]>cnt[0] && cnt[1]>cnt[2]){
            max[0]=1;
            max[1]=2;
        }
        else if(cnt[2]>cnt[0] && cnt[2]>cnt[1]){
            max[0]=1;
            max[1]=3;
        }
        else if(cnt[0]==cnt[1] && cnt[0]>cnt[2]){
            max[0]=2;
            max[1]=1;
            max[2]=2;
        }
        else if(cnt[2]==cnt[1] && cnt[2]>cnt[0]){
            max[0]=2;
            max[1]=2;
            max[2]=3;
        }
        else if(cnt[0]==cnt[2] && cnt[0]>cnt[1]){
            max[0]=2;
            max[1]=1;
            max[2]=3;
        }
        int []answer=new int[max[0]];
        if(max[0]==1){
            answer[0]=max[1];
        }
        else if(max[0]==2){
            answer[0]=max[1];
            answer[1]=max[2];
        }
        else{
            answer[0]=1;
            answer[1]=2;
            answer[2]=3;
        }
        return answer;
    }
}