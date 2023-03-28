import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        while(!str.equals("#")){
            char ch[]=str.toCharArray();
            int N=str.length();
            int sum=0;
            int e=1;
            for(int i=0;i<N-1;i++){
                e=e*8;
            }
            for(int i=0;i<N;i++){
                int x=0;
                if(ch[i]=='-'){
                    x=0;
                }
                else if(ch[i]=='('){
                    x=2;
                }
                else if(ch[i]=='@'){
                    x=3;
                }
                else if(ch[i]=='?'){
                    x=4;
                }
                else if(ch[i]=='>'){
                    x=5;
                }
                else if(ch[i]=='&'){
                    x=6;
                }
                else if(ch[i]=='%'){
                    x=7;
                }
                else if(ch[i]=='/'){
                    x=-1;
                }
                else x=1;
            sum+=x*e;
            e=e/8;
            }
            sb.append(sum).append("\n");
            str=br.readLine();
        }
        System.out.println(sb);
    }
}
