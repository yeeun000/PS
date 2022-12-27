import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        float f[]=new float[N];
        for(int i=0;i<N;i++){
            f[i]=Float.parseFloat(br.readLine());
        }
        Arrays.sort(f);
        System.out.printf("%.2f",f[1]);
    }
}
