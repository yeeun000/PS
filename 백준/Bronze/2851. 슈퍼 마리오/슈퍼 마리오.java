import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int sum=0;
        int cnt=0;
        for(int i=0;i<10;i++){
            int a=Integer.parseInt(br.readLine());
            sum+=a;
            if(sum>100){
                if(Math.abs(100-sum)>Math.abs(100-sum+a))
                    sb.append(sum-a);
                else sb.append(sum);
                cnt++;
                break;
            }
        }
        if(cnt==0)
            System.out.println(sum);
        else
        System.out.println(sb);
    }
}
