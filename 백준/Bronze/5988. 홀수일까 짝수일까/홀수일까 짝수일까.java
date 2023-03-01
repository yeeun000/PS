import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            String str = br.readLine();
            char ch=str.charAt(str.length()-1);
            if(ch=='2' || ch=='4' || ch=='6' || ch=='8' || ch=='0')
                sb.append("even").append("\n");
            else sb.append("odd").append("\n");
        }
        System.out.println(sb);
    }
}
