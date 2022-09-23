
import java.util.*;
import java.io.*;
public class Main {
    static StringBuilder sb;
    static StringTokenizer st;
    static BufferedReader br;
    static int []arr;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        sb=new StringBuilder();
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        arr=new int[8];
        for(int i=0;i<8;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        int Cnt=0;
        int Dnt=0;
        for(int i=1;i<9;i++){
            if(arr[i-1]==i){
                Cnt++;
            }
        }
        if(Cnt!=8){
            int j=0;
            for (int i = 8; i > 0; i--) {
                if (arr[j] == i) {
                    Dnt++;
                }
                j++;
            }
        }
        if(Cnt==8)
            sb.append("ascending");
        else if(Dnt==8)
            sb.append("descending");
        else sb.append("mixed");
        System.out.println(sb);
    }
}
