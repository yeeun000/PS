import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str=br.readLine();
            int cnt=0;
            int c=0;
            for(int j=0;j<str.length();j++){
                char ch=str.charAt(j);
                if(ch==' ')
                    continue;
                else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                    cnt++;
                else c++;
            }
            sb.append(c).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
