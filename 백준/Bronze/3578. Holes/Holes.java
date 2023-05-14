import java.io.*;
public class Main {
    public static void main (String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        if(N==0)
            sb.append("1");
        else if(N%2==0){
            for(int i=0;i<N/2;i++){
                sb.append("8");
            }
        }
        else if(N==1)
            sb.append("0");
        else{
            sb.append("4");
            for(int i=0;i<(N-1)/2;i++){
                sb.append("8");
            }
        }
        System.out.println(sb);
    }
}
