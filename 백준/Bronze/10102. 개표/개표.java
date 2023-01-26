import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String str=br.readLine();
        char []ch=str.toCharArray();
        int cnt_A=0;
        int cnt_B=0;
        for(int i=0;i<N;i++) {
            if (ch[i] == 'A')
                cnt_A++;
            else cnt_B++;
        }
        if(cnt_A<cnt_B)
            sb.append("B");
        else if (cnt_A>cnt_B)
            sb.append("A");
        else sb.append("Tie");
        System.out.println(sb);
    }
}
