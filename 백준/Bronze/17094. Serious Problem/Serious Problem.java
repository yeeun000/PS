import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String str=br.readLine();
        int cnt_2=0;
        int cnt=0;
        for(int i=0;i<N;i++){
            char c=str.charAt(i);
            if(c=='2')
                cnt_2++;
            else cnt++;
        }
        if(cnt_2>cnt)
            sb.append("2");
        else if(cnt_2==cnt)
            sb.append("yee");
        else sb.append("e");
        System.out.println(sb);
    }
}
