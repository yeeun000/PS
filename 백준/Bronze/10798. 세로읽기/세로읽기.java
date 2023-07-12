import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String st[]=new String[5];
        for(int i=0;i<5;i++){
            st[i]=br.readLine();
        }
        char ch[][]=new char[5][];
        int max=0;
        for(int i=0;i<5;i++){
            ch[i]=st[i].toCharArray();
            if(max<st[i].length()){
                max=st[i].length();
            }
        }
        for(int i=0;i<max;i++){
            for(int j=0;j<5;j++){
                if(st[j].length()-1<i)
                    continue;
                sb.append(ch[j][i]);
            }
        }
        System.out.println(sb);
    }
}
