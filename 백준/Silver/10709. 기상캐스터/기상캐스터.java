import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int H=Integer.parseInt(st.nextToken());
        int W=Integer.parseInt(st.nextToken());
        int temp=0;
        for(int i=0;i<H;i++){
            String str=br.readLine();
            char ch[]=str.toCharArray();
            int cnt=0;
            for(int j=0;j<W;j++){
                if(ch[j]=='c') {
                    temp = j;
                    sb.append("0");
                    cnt++;
                }
                else if(cnt==0){
                    sb.append("-1");
                }
                else{
                    sb.append(j-temp);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
