import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        String str[]=new String[N];
        for(int i=0;i<N;i++){
            str[i]=br.readLine();
        }
        Arrays.sort(str);
        sb.append(str[M-1]);
        System.out.println(sb);
    }
}
