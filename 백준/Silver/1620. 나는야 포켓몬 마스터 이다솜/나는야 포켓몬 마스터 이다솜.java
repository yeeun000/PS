import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        Map<String, Integer> map=new HashMap();
        String str[]=new String[N];
        for(int i=0;i<N;i++){
            String s=br.readLine();
            map.put(s,i+1);
            str[i]=s;
        }
        for(int i=0;i<M;i++){
            String as=br.readLine();
            char c[]=as.toCharArray();
            if(c[0]>=48 && c[0]<=57){
               sb.append(str[Integer.parseInt(as)-1]);
            }
            else
                sb.append(map.get(as));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
