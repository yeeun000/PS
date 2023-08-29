import java.io.*;
import java.util.*;
public class Main {
    static ar[]arr;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        arr=new ar[N];
        for(int i=0;i<N;i++){
            String name=br.readLine();
            char ch[]=name.toCharArray();
            int length=name.length();
            int sum=0;
            for(int j=0;j<name.length();j++){
                if(ch[j]>47 && ch[j]<58) {
                    sum += (int) ch[j]-'0';
                }
            }
            arr[i]=new ar(name,length,sum);
        }
        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            sb.append(arr[i].name).append("\n");
        }
        System.out.println(sb);
    }

    static class ar implements Comparable<ar>{
        String name;
        int length,sum;
        public ar(String name,int length, int sum){
            this.name=name;
            this.length=length;
            this.sum=sum;
        }
        @Override
        public int compareTo(ar o){
            if(this.length==o.length){
                if(this.sum==o.sum){
                    return this.name.compareTo(o.name);
                }
                return Integer.compare(this.sum,o.sum);
            }
            return Integer.compare(this.length,o.length);
        }
    }
}
