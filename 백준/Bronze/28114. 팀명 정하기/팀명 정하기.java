import java.io.*;
import java.util.*;
public class Main {
    static ar[] ar2;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int []arr=new int [3];
        ar2=new ar[3];
        for(int i=0;i<3;i++){
            st=new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());
            arr[i]=Integer.parseInt(st.nextToken())%100;
            String name=st.nextToken();
            ar2[i]=new ar(num,name);
        }
        Arrays.sort(arr);
        Arrays.sort(ar2);
        for(int i=0;i<3;i++){
            sb.append(arr[i]);
        }
        sb.append("\n");
        for(int i=0;i<3;i++){
            char c=ar2[i].name.charAt(0);
            sb.append(c);
        }
        System.out.println(sb);
    }
    static class ar implements Comparable<ar>{
        int num;
        String name;
        public ar(int num,String name){
            this.num=num;
            this.name=name;
        }
        @Override
        public int compareTo(ar o){
            return Integer.compare(o.num, this.num);
        }
    }
}
