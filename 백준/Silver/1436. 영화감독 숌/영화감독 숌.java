import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int a = 666;
        int cnt = 1;

        while(cnt != N) {
            a++;
            if(String.valueOf(a).contains("666")) {
                cnt++;
            }
        }
        sb.append(a);
        System.out.println(sb);
    }
}