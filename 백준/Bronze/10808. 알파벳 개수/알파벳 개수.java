import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s=br.readLine();
        char [] ch=s.toCharArray();
        int []arr=new int[26];
        for(int i=0;i<s.length();i++){
            if(ch[i]=='a')
                arr[0]++;
            else if(ch[i]=='b')
                arr[1]++;
            else if(ch[i]=='c')
                arr[2]++;
            else if(ch[i]=='d')
                arr[3]++;
            else if(ch[i]=='e')
                arr[4]++;
            else if(ch[i]=='f')
                arr[5]++;
            else if(ch[i]=='g')
                arr[6]++;
            else if(ch[i]=='h')
                arr[7]++;
            else if(ch[i]=='i')
                arr[8]++;
            else if(ch[i]=='j')
                arr[9]++;
            else if(ch[i]=='k')
                arr[10]++;
            else if(ch[i]=='l')
                arr[11]++;
            else if(ch[i]=='m')
                arr[12]++;
            else if(ch[i]=='n')
                arr[13]++;
            else if(ch[i]=='o')
                arr[14]++;
            else if(ch[i]=='p')
                arr[15]++;
            else if(ch[i]=='q')
                arr[16]++;
            else if(ch[i]=='r')
                arr[17]++;
            else if(ch[i]=='s')
                arr[18]++;
            else if(ch[i]=='t')
                arr[19]++;
            else if(ch[i]=='u')
                arr[20]++;
            else if(ch[i]=='v')
                arr[21]++;
            else if(ch[i]=='w')
                arr[22]++;
            else if(ch[i]=='x')
                arr[23]++;
            else if(ch[i]=='y')
                arr[24]++;
            else
                arr[25]++;
        }
        for(int i=0;i<26;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
