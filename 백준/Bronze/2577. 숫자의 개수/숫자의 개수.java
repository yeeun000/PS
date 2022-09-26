
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    static int A,B,C,Sum;
    static char[]ch;
    static int[]Cnt;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        Cnt=new int [10];
        A=Integer.parseInt(br.readLine());
        B=Integer.parseInt(br.readLine());
        C=Integer.parseInt(br.readLine());
        Sum=A*B*C;
        str=Integer.toString(Sum);
        ch=str.toCharArray();

    }
    static void logic(){
        for(int i=0;i<str.length();i++) {
            switch(ch[i]){
                case '0':
                    Cnt[0]++;
                    break;
                case '1':
                    Cnt[1]++;
                    break;
                case '2':
                    Cnt[2]++;
                    break;
                case '3':
                    Cnt[3]++;
                    break;
                case '4':
                    Cnt[4]++;
                    break;
                case '5':
                    Cnt[5]++;
                    break;
                case '6':
                    Cnt[6]++;
                    break;
                case '7':
                    Cnt[7]++;
                    break;
                case '8':
                    Cnt[8]++;
                    break;
                default:
                    Cnt[9]++;
                    break;
            }
        }
        for(int i=0;i<10;i++){
            sb.append(Cnt[i]).append('\n');
        }
        System.out.println(sb);
    }
}
