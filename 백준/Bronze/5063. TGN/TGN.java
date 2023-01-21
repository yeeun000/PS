import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
           st=new StringTokenizer(br.readLine());
           int r=Integer.parseInt(st.nextToken());
           int e=Integer.parseInt(st.nextToken());
           int c=Integer.parseInt(st.nextToken());
           if(r>e-c){
               sb.append("do not advertise").append("\n");
           }
           else if(r==(e-c)){
               sb.append("does not matter").append("\n");
           }
           else{
               sb.append("advertise").append("\n");
           }
        }
        System.out.println(sb);
    }
}
