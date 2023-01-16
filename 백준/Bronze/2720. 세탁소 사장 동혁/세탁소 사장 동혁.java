import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        int []arr=new int[4];
        arr[0]=25;
        arr[1]=10;
        arr[2]=5;
        arr[3]=1;
        for(int i=0;i<T;i++){
            int C=Integer.parseInt(br.readLine());
            for(int j=0;j<4;j++){
                if(C>=arr[j]){
                    sb.append(C/arr[j]).append(" ");
                    C=C%arr[j];
                }
                else sb.append("0").append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
