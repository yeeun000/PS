import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int S=Integer.parseInt(br.readLine());
        if(N<5)
            sb.append(S);
        else if(N<10) {
            if(S-500<0)
                sb.append("0");
            else
            sb.append(S - 500);
        }
        else if(N<15){
            int y=(int)(S-S*0.1);
            if(S-500<y){
                if(S-500<0)
                    sb.append("0");
                else
                    sb.append(S - 500);
            }
            else sb.append(y);
        }
        else if(N<20){
            int y=(int)(S-S*0.1);
            if(S-2000<y){
                if(S-2000<0)
                    sb.append("0");
                else
                    sb.append(S - 2000);
            }
            else sb.append(y);
        }
        else {
            int y=(int)(S-S*0.25);
            if(S-2000<y){
                if(S-2000<0)
                    sb.append("0");
                else
                    sb.append(S - 2000);
            }
            else sb.append(y);
        }
        System.out.println(sb);
    }
}
