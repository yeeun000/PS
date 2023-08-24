import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int []arr=new int [N];
        int []ar=new int [N];
        Stack<Integer> s=new Stack<>();
        int cnt=0;
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            cnt=0;
            while(true){
                if(s.empty()){
                    s.push(i);
                    break;
                }
                if(arr[s.peek()]>=arr[i]) {
                    s.push(i);
                    break;
                }
                else{
                    cnt++;
                    ar[s.peek()]=arr[i];
                    s.pop();
                }
            }
        }
        for(int i=0;i<N;i++){
            if(ar[i]==0){
                sb.append("-1 ");
            }
            else sb.append(ar[i]).append(" ");
        }
        System.out.println(sb);
    }
}
