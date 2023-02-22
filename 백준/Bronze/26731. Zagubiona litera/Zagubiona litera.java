import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        int j=65;
        for(int i=0;i<25;i++){
            if(ch[i]!=j){
                break;
            }
            j++;
        }
        char c=(char)j;
        sb.append(c);
        System.out.println(sb);
    }
}
