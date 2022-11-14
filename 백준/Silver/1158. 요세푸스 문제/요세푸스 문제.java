import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=i+1;
        }
        sb.append("<");
        int i=1;
        int cnt=0;
        if(N==1){
            sb.append(N+">");
        }
        else {
            while(true) {
            for (int j = 0; j < N; j++) {
                if (arr[j] == 0) {
                    continue;
                }
                if (i == K && cnt != N - 1) {
                    sb.append(arr[j]).append(", ");
                    arr[j] = 0;
                    cnt++;
                    i = 0;
                }
                if (i == K && cnt == N - 1) {
                    sb.append(arr[j]).append(">");
                    cnt++;
                }
                i++;
                if (cnt == N)
                    break;
            }
            if (cnt == N)
                break;
        }
        }
        System.out.println(sb);
    }
}