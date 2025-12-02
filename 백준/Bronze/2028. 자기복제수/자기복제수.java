

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
           long num=Long.parseLong(br.readLine());
           String org=String.valueOf(num);
           num*=num;
           String s=String.valueOf(num);
           if(s.endsWith(org)){
               sb.append("YES\n");
           }
           else sb.append("NO\n");

        }
        System.out.println(sb);
    }
}
