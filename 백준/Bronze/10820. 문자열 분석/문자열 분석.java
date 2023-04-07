import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str="";
        while((str=br.readLine())!=null){
            char ch[]=str.toCharArray();
            int cnt_A=0;
            int cnt_a=0;
            int cnt_1=0;
            int cnt=0;
            for(int i=0;i<str.length();i++){
                if(ch[i]<91 && ch[i]>64)
                    cnt_A++;
                else if(ch[i]<123 && ch[i]>89)
                    cnt_a++;
                else if(ch[i]<58 && ch[i]>47)
                    cnt_1++;
                else cnt++;
            }
            sb.append(cnt_a+" "+cnt_A+" "+cnt_1+" "+cnt).append("\n");
        }
        System.out.println(sb);
    }
}
