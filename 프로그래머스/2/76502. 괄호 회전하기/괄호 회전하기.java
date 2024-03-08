import java.io.*;
import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int len=s.length();
        for(int j=0;j<len;j++){
            Stack<Character> stack=new Stack<>();
            char ch[]=s.toCharArray();
            s="";
            int cnt=0;
            for(int i=0;i<len;i++){
                if(i!=0){
                    s+=ch[i];
                }
                if(ch[i]=='['){
                    stack.push(ch[i]);
                }
                else if(ch[i]=='('){
                    stack.push(ch[i]);
                }
                else if(ch[i]=='{'){
                    stack.push(ch[i]);
                }
                else{
                    if(stack.isEmpty()){
                        cnt++;
                    } else{
                    char c=stack.peek();
                    if(ch[i]==']'){
                        if(c!='['){
                            cnt++;
                        }
                        else{
                            stack.pop();
                        }    
                    }
                    else if(ch[i]==')'){
                        if(c!='('){
                            cnt++;
                        }
                        else{
                            stack.pop();
                        }
                    }
                    else if(ch[i]=='}'){
                        if(c!='{'){
                            cnt++;
                        }
                        else{
                            stack.pop();
                        }
                    }
                    }
                }
            }
            if(cnt==0 && stack.isEmpty()){
                answer++;
            }
            s+=ch[0];
        }
        return answer;
    }
}