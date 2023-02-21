import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int cnt=0;
        for(int i=0;i<N;i++){
            if(ch[i]=='a'|| ch[i]=='i'||ch[i]=='u'||ch[i]=='e'||ch[i]=='o')
                cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
