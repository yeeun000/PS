import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] str =new String [N];
        for(int i=0;i<N;i++){
            str[i]=br.readLine();
        }
        int T=Integer.parseInt(br.readLine());
        if(T==1){
            for(int i=0;i<N;i++){
                sb.append(str[i]).append("\n");
            }
        }
        else if(T==2){
            for(int i=0;i<N;i++){
                char ch[]=str[i].toCharArray();
                for(int j=0;j<N;j++){
                    sb.append(ch[N-j-1]);
                }
                sb.append("\n");
            }
        }
        else{
            for(int i=N-1;i>-1;i--){
                sb.append(str[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
