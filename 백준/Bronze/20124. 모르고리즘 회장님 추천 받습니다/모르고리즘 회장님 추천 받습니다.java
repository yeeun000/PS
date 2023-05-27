import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        String [][]arr=new String [N][2];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[1])==Integer.parseInt(o2[1]))
                    return o1[0].toString().compareTo(o2[0].toString());
                else return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);
            }
        });
        sb.append(arr[0][0]);
        System.out.println(sb);
    }
}
