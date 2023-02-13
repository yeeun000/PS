import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            char ch[]=br.readLine().toCharArray();
            if(ch[0]<123 && ch[0]>96)
                ch[0]=(char)(ch[0]-32);
            sb.append(String.valueOf(ch)).append("\n");
        }
        System.out.println(sb);
    }
}
