import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int []arr=new int [4];
        for(int i=0;i<4;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int r=0;
        int d=0;
        int c=0;
        for(int i=0;i<3;i++){
            if(arr[i]>arr[i+1])
                d++;
            else if(arr[i]<arr[i+1])
                r++;
            else c++;
        }
        if(r==3)
            sb.append("Fish Rising");
        else if(d==3)
            sb.append("Fish Diving");
        else if(c==3)
            sb.append("Fish At Constant Depth");
        else sb.append("No Fish");
        System.out.println(sb);
    }
}
