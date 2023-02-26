import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='B')
                cnt++;
            else break;
        }
        int sum=0;
        sum=cnt/2;
        sum+=((str.length()-cnt)/2);
        sb.append(sum);
        System.out.println(sb);
    }
}
