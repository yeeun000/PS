import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine(),"*");
        String a=st.nextToken();
        String b=st.nextToken();
        for(int i=0;i<N;i++){
            String s=br.readLine();
            char c[]=s.toCharArray();
            String q="";
            String w="";
            if(s.length()>=a.length()+b.length()) {
                for (int j = 0; j < a.length(); j++) {
                    q += c[j];
                }
                for (int j = s.length()-b.length(); j < s.length(); j++) {
                    w += c[j];
                }
                if (q.equals(a) && w.equals(b)){
                    sb.append("DA");
                }
                else sb.append("NE");
            }
            else sb.append("NE");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
