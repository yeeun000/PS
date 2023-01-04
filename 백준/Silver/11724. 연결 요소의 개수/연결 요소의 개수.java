import java.util.*;
import java.io.*;
public class Main {
    static ArrayList<Integer>[]A;
    static boolean visited[];
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        A=new ArrayList[N+1];
        visited=new boolean[N+1];
        for(int i=1;i<N+1;i++){
            A[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st.nextToken());
            int e=Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int cnt=0;
        for(int i=1;i<N+1;i++){
            if(!visited[i]){
                cnt++;
                dfs(i);
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
    static void dfs(int v){
        if(visited[v])
            return;
        visited[v]=true;
        for(int i:A[v]){
            if(visited[i]==false)
                dfs(i);
        }
    }
}
