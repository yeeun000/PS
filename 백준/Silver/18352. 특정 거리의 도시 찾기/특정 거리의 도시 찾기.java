import java.util.*;
import java.io.*;
public class Main {
    static int visited[];
    static int N,M,K,X;
    static List<Integer> an;
    static ArrayList<Integer>[] a;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());
        X=Integer.parseInt(st.nextToken());
        a=new ArrayList[N+1];
        an=new ArrayList<>();
        for(int i=1;i<=N;i++){
            a[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            a[s].add(e);
        }
        visited=new int [N+1];
        for(int i=0;i<=N;i++){
            visited[i]=-1;
        }
        bfs(X);
        for(int i=0;i<=N;i++){
            if(visited[i]==K)
                an.add(i);
        }
        if(an.isEmpty())
            System.out.println("-1");
        else{
            Collections.sort(an);
            for(int temp:an)
                System.out.println(temp);
        }
    }
    public static void bfs(int n){
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(n);
        visited[n]++;
        while(!q.isEmpty()){
            int no=q.poll();
            for(int i:a[no]){
                if(visited[i]==-1){
                    visited[i]=visited[no]+1;
                    q.add(i);
                }
            }
        }
    }
}
