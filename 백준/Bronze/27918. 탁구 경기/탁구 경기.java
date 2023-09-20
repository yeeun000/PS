import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int d=0;
        int p=0;
        int N=Integer.parseInt(br.readLine());
        String s[]=new String [N];
        for(int i=0;i<N;i++){
            s[i]=br.readLine();
        }
        for(int i=0;i<N;i++){
            if(d>p) {
                if (d==p+2)
                    break;
            }
            else if (p>d){
                if(p==d+2)
                    break;
            }
                if(s[i].equals("D"))
                    d++;
                else p++;

        }
        sb.append(d+":"+p);
        System.out.println(sb);
    }
}
