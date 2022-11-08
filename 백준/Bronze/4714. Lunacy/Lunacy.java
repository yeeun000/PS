import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        double s=Double.parseDouble(br.readLine());
        while(s>0){
            double x=s*0.167;
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n",s,x);
            s=Double.parseDouble(br.readLine());
        }
    }
}
