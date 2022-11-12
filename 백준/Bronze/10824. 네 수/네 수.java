import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        st=new StringTokenizer(br.readLine());
        String A=st.nextToken();
        String B=st.nextToken();
        String C=st.nextToken();
        String D=st.nextToken();
        String AB=A+B;
        String CD=C+D;
       long ab=Long.parseLong(AB);
        long cd=Long.parseLong(CD);
        sb.append(ab+cd);
        System.out.println(sb);
    }
}
