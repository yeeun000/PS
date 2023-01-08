import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        int C=Integer.parseInt(br.readLine());
        int D=Integer.parseInt(br.readLine());
        int E=Integer.parseInt(br.readLine());
        int s=0;
        if(A>0){
            s=(B-A)*E;
        }
        else if(A==0){
            s=D+B*E;
        }
        else{
            s=A*(-C)+D+B*E;
        }
        sb.append(s);
        System.out.println(sb);
    }
}
