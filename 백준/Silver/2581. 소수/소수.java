import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N,M;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        M=Integer.parseInt(br.readLine());
    }
    static void logic(){
        int sum=0;
        int cnt=0;
        int re=0;
        int x=0;
        for(int i=N;i<=M;i++){
            for(int j=1;j<10000;j++){
                if(i==1)
                    break;
                if(i%j==0)
                    cnt++;
                if(cnt>=3)
                    break;
            }
            if(i==1)
                continue;
            if(cnt<3) {
                sum += i;
                re++;
                if(x==0){
                    x=i;
                }
            }
            cnt=0;
        }
        if(re==0)
            sb.append(-1);
        else if(N==1 && M==1)
            sb.append(-1);
        else{
            sb.append(sum+"\n"+x);
        }
        System.out.println(sb);
    }
}
