import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int []A_arr=new int[A];
        int []B_arr=new int[B];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<A;i++){
            A_arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A_arr);
        st=new StringTokenizer(br.readLine());
        int cnt=0;
        for(int i=0;i<B;i++){
            B_arr[i]=Integer.parseInt(st.nextToken());
            if(binarySearch(A_arr,0,A-1,B_arr[i])==1){
                cnt++;
            }
        }
        sb.append((A-cnt)+(B-cnt));
        System.out.println(sb);
    }
    static int binarySearch(int[] arr, int L, int R, int X) {
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == X) {
                return 1;
            } else if (arr[mid] < X) {
                L = mid + 1;
            } else if (arr[mid] > X){
                R = mid - 1;
            }
        }
        return 0;
    }
}
