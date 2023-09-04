import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String arr[]=new String[N];
        String str=br.readLine();
        char ch[]=str.toCharArray();
        for(int i=1;i<N;i++){
            arr[i]=br.readLine();
        }
        for(int i=1;i<N;i++){
            char c[]=arr[i].toCharArray();
            for(int j=0;j<str.length();j++){
                if(ch[j]==c[j])
                    continue;
                else{
                    ch[j]='?';
                }
            }
        }
        for(int i=0;i<str.length();i++){
            sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}
