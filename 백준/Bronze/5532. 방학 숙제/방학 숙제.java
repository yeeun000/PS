
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int L,A,B,C,D;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        L=Integer.parseInt(br.readLine());
        A=Integer.parseInt(br.readLine());
        B=Integer.parseInt(br.readLine());
        C=Integer.parseInt(br.readLine());
        D=Integer.parseInt(br.readLine());
    }
    static void logic(){
        int S,V;
        S=A%C;
        if(S!=0)
            S=A/C+1;
        else S=A/C;
        V=B%D;
        if(V!=0)
            V=B/D+1;
        else V=B/D;
        if(S<=V)
            sb.append(L-V);
        else sb.append(L-S);
        System.out.println(sb);
    }
}
