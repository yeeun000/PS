import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int cnt=0;
        int k=N;
        int i=1;
        while(true){
            if(k<=0)
                break;
            if(k<i){
                i=1;
                k=k-i;
            }
            else{
                k=k-i;
            }
            cnt++;
            i++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
