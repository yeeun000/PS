import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int x=0;
        String str=br.readLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='p' && i<str.length()-1){
                if(ch[i+1]=='i'){
                    i++;
                    continue;
                }
                else{
                   x++;
                   break;
                }
            }
            else if(ch[i]=='k' && i<str.length()-1){
                if(ch[i+1]=='a'){
                    i++;
                    continue;
                }
                else{
                    x++;
                    break;
                }
            }
            else if(ch[i]=='c' && i<str.length()-2){
                if(ch[i+1]=='h' && i<str.length()-1){
                    if(ch[i+2]=='u'){
                        i+=2;
                        continue;
                    }
                    else{
                        x++;
                        break;
                    }
                }
                else{
                    x++;
                    break;
                }
            }
            else{
                x++;
                break;
            }
        }
        if(x==0){
            sb.append("YES");
        }
        else sb.append("NO");
        System.out.println(sb);
    }
}
