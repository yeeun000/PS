import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String []str=new String[N];
        char []c=new char[N];
        for(int i=0;i<N;i++){
            str[i]=br.readLine();
            char ch[]=str[i].toCharArray();
            c[i]=ch[0];
        }
        Arrays.sort(c);
        int cnt=1;
        int p=0;
        for(int i=0;i<N-1;i++){
            if(c[i]==c[i+1]) {
                cnt++;
                if(cnt==5) {
                    p++;
                    sb.append(c[i]);
                }
            }
            else cnt=1;
        }
        if(p==0)
            sb.append("PREDAJA");
        System.out.println(sb);
    }
}
