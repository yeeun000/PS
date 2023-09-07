import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            int x=Integer.parseInt(st.nextToken());
            sb.append(str);
            if(x>96)
                sb.append(" A+");
            else if(x>89)
                sb.append(" A");
            else if(x>86)
                sb.append(" B+");
            else if(x>79)
                sb.append(" B");
            else if(x>76)
                sb.append(" C+");
            else if(x> 69)
                sb.append(" C");
            else if(x>66)
                sb.append(" D+");
            else if(x> 59)
                sb.append(" D");
            else sb.append(" F");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
