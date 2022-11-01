import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr=new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<A;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<B;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        for(int i=0;i<A+B;i++){
            sb.append(arr.get(i)+" ");
        }
        System.out.println(sb);
    }
}