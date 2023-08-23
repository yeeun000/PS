import java.util.*;
import java.io.*;
public class Main {
    static int N,M;
    static boolean[][] visit;
    static int [][] g;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        visit=new boolean[N][M];
        g=new int [N][M];
        for(int i=0;i<N;i++){
            String str=br.readLine();
            for(int j=0;j<M;j++){
                g[i][j]=str.charAt(j)-'0';
            }
        }
        visit[0][0]=true;
        bfs(0,0);
        System.out.println(g[N-1][M-1]);
    }
    public static void bfs(int x,int y){
        int []dx ={-1,1,0,0};
        int []dy={0,0,-1,1};
        Queue<int[]> q=new LinkedList<>();
        q.add(new int [] {x,y});
        while(!q.isEmpty()){
            int now[]=q.poll();
            int nowX=now[0];
            int nowY=now[1];
            for(int i=0;i<4;i++){
                int nextX=nowX+dx[i];
                int nextY=nowY+dy[i];

                if(nextX<0 || nextY<0 || nextX>=N ||nextY>=M)
                    continue;
                if(visit[nextX][nextY] || g[nextX][nextY]==0)
                    continue;
                q.add(new int[] {nextX, nextY});
                g[nextX][nextY]=g[nowX][nowY]+1;
                visit[nextX][nextY]=true;
            }
        }
    }
}
