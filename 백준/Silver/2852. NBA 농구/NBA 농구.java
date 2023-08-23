import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int team_a=0;
        int team_b=0;
        int a=0;
        int team[]=new int [N];
        int time[]=new int [N+1];
        int x=48*60;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            team[i]=Integer.parseInt(st.nextToken());
            String t=st.nextToken();
            st=new StringTokenizer(t,":");
            a=60*Integer.parseInt(st.nextToken());
            a+=Integer.parseInt(st.nextToken());
            time[i]=a;
        }
        time[N]=x;
        if(N==1){
            x=x-a;
            if(team[0]==1) {
                System.out.printf("%02d:%02d",x / 60,x % 60);
                System.out.println();
                System.out.println("00:00");
            }
            else{
                System.out.println("00:00");
                System.out.printf("%02d:%02d",x / 60,x % 60);
            }
        }
        else{
            int team_a_cnt=0;
            int team_b_cnt=0;
            for(int i=1;i<=N;i++){
                if(team[i-1]==1){
                    team_a_cnt++;
                }
                else{
                    team_b_cnt++;
                }
                if(team_a_cnt>team_b_cnt) {
                    team_a+=time[i]-time[i-1];
                }
                else if(team_b_cnt>team_a_cnt) {
                    team_b+=time[i]-time[i-1];
                }
            }
            System.out.printf("%02d:%02d",team_a / 60,team_a % 60);
            System.out.println();
            System.out.printf("%02d:%02d",team_b / 60,team_b % 60);
        }
    }
}
