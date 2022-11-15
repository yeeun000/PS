import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String []str=new String[N];
        for(int i=0;i<N;i++){
            str[i]=br.readLine();
        }
        Arrays.sort(str);
        int cnt=0;
        int max=0;
        String s="";
        if(N==1)
            sb.append(str[0]);
        else {
            for (int i = 0; i < N - 1; i++) {
                if(i==0)
                    s=str[i];
                if (str[i].equals(str[i + 1])) {
                    cnt++;
                    if (cnt > max) {
                        max = cnt;
                        s = str[i];
                    }
                } else cnt = 0;
            }
            sb.append(s);
        }
        System.out.print(sb);
    }
}
