import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int A_cnt=0;
        int B_cnt=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='A'){
                i++;
                if(ch[i]=='1')
                    A_cnt++;
                else A_cnt+=2;
            }
            else{
                i++;
                if(ch[i]=='1')
                    B_cnt++;
                else B_cnt+=2;
            }
        }
        if(A_cnt<B_cnt)
            sb.append("B");
        else sb.append("A");
        System.out.println(sb);
    }
}
