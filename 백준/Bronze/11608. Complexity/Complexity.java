import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        int cnt=1;
        for(int i=1;i<str.length();i++){
           if(ch[i-1]!=ch[i]) {
               cnt++;
           }
        }
        int []arr=new int [cnt];
        int p=0;
        for(int i=0;i<str.length()-1;i++){
            if(ch[i]!=ch[i+1]) {
                arr[p]++;
                p++;
            }
            else arr[p]++;
        }
        if(ch[str.length()-2]!=ch[str.length()-1]){
            arr[p]=1;
        }
        else if(ch[str.length()-2]==ch[str.length()-1]){
            arr[p]++;
        }
        Arrays.sort(arr);
        if(cnt>2){
            int sum=0;
            for(int i=0;i<cnt-2;i++){
                sum+=arr[i];
            }
            sb.append(sum);
        }
        else sb.append("0");
        System.out.println(sb);
    }
}
