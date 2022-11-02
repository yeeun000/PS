import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=N;i++){
            q.add(i);
        }
        while(true){
            if(q.size()==1)
                break;
            sb.append(q.peek()).append(" ");
            q.remove();
            q.add(q.peek());
            q.remove();
        }
        sb.append(q.poll());
        System.out.println(sb);
    }
}
