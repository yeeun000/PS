import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N,M,V;
    static int [][]adj;
    static boolean[] visit;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        V=Integer.parseInt(st.nextToken());
        adj=new int [N+1][N+1];
        for(int i=1;i<=M;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            adj[x][y]=1;
            adj[y][x]=1;
        }
        visit=new boolean[N+1];
        dfs(V);
        sb.append("\n");
        for(int i=1;i<=N;i++){
            visit[i]=false;
        }
        bfs(V);
        System.out.println(sb);
    }
    static void dfs(int x){
        visit[x]=true;
        sb.append(x).append(" ");
        for(int y=1;y<=N;y++){
            if(adj[x][y]==0) continue;
            if(visit[y]==true)continue;
            dfs(y);
        }
    }
    static void bfs(int x){
        Queue<Integer>que=new LinkedList<>();
        que.add(x);
        visit[x]=true;
        while(!que.isEmpty()){
            x=que.poll();
            sb.append(x).append(" ");
            for(int y=1;y<=N;y++){
                if(adj[x][y]==0)
                    continue;
                if(visit[y]==true) continue;
                que.add(y);
                visit[y]=true;
            }
        }
    }
}
