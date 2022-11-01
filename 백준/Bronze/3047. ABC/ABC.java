import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int []arr=new int[3];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        String str=br.readLine();
        Arrays.sort(arr);

        char []ch=str.toCharArray();
        for(int i=0;i<3;i++){
            if(ch[i]=='A')
                sb.append(arr[0]).append(" ");
            else if(ch[i]=='B')
                sb.append(arr[1]).append(" ");
            else sb.append(arr[2]).append(" ");
        }
        System.out.println(sb);
    }
}
