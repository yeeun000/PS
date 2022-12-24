import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str=br.readLine();
            char ch[]=str.toCharArray();
            sb.append(ch[0]);
            for(int j=1;j<str.length();j++){
                if(ch[j-1]==ch[j])
                    continue;
                else{
                    sb.append(ch[j]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
