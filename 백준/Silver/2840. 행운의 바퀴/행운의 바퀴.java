
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int turn= Integer.parseInt(st.nextToken());
        int pont=0;
        int s=0;
        char c=' ';
        char ch[]=new char[N];

        for(int i=0;i<N;i++){
            ch[i]='?';
        }

        boolean no=true;
        for(int i=0;i<turn;i++){
            st=new StringTokenizer(br.readLine());
            pont=Integer.parseInt(st.nextToken());
            c=st.nextToken().charAt(0);
            if(pont>=N)
                pont=pont%N;
            if(s-pont<0)
                s=N+s-pont;
            else s=s-pont;
            if(ch[s]!='?' && ch[s]!=c) {
                no = false;
                break;
            }
            for (int j = 0; j < N; j++) {
                if (j != s && ch[j] == c) {
                    no = false;
                    break;
                }
            }
            ch[s]=c;
        }
        if(no){
            int p = s;
            for (int i = 0; i < N; i++) {
                System.out.print(ch[p]);
                p++;
                if (p == N) {
                    p = 0;
                }
            }
        }
        else
            System.out.println("!");
    }
}

