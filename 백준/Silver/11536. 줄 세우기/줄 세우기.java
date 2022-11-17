import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String []str=new String[N];
        String []st=new String[N];
        for(int i=0;i<N;i++){
            String s=br.readLine();
            str[i]=s;
            st[i]=s;
        }
        Arrays.sort(str);
        int cnt=0;
        int no=0;
        for(int i=0;i<N;i++){
            if(N%2==1 && i==(N-1-i)){
            if(str[i].equals(st[i])) {
                cnt++;
                no++;
            }
            }
            else{
                if(str[i].equals(st[i])) {
                    cnt++;
                }
                else if(st[i].equals(str[N-1-i]))
                    no++;
            }
        }
        if(cnt==N)
            sb.append("INCREASING");
        else if(no==N)
            sb.append("DECREASING");
        else sb.append("NEITHER");
        System.out.println(sb);
    }
}