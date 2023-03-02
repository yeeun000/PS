import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int cnt=0;
        for(int i=0;i<N;i++){
            int q=0;
            String str=br.readLine();
            char ch[]=str.toCharArray();
            for(int j=0;j<str.length()-1;j++){
                if(ch[j]=='C'){
                    if(ch[j+1]=='D') {
                        q++;
                        break;
                    }
                }
            }
            if(q==0)
                cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
