import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int arr[]=new int [str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=ch[i]-'0';
        }
        Arrays.sort(arr);
        for(int i=str.length()-1;i>=0;i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
