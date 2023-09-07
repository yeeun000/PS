import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int i=1;
        while(N!=0){
            sb.append(i);
            int a=3*N;
            int b=0;
            if(a%2==0) {
                b=N/2;
                sb.append(". even ");
            }
            else {
                b=(N-1)/2;
                sb.append(". odd ");
            }
            sb.append(b).append('\n');
            N=Integer.parseInt(br.readLine());
            i++;
        }
        System.out.println(sb);
    }
}
