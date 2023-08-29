import java.io.*;
import java.util.*;
public class Main {
    static arr[]ar;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char c[]=str.toCharArray();
        int l=0,o=0,v=0,e=0;
        for(int j=0;j<str.length();j++){
            if(c[j]=='L')
                l++;
            else if(c[j]=='O')
                o++;
            else if(c[j]=='V')
                v++;
            else if(c[j]=='E')
                e++;
        }
        int N=Integer.parseInt(br.readLine());
        ar=new arr[N];
        for(int i=0;i<N;i++){
            String name=br.readLine();
            char ch[]=name.toCharArray();
            int L=0,O=0,V=0,E=0;
            for(int j=0;j<name.length();j++){
                if(ch[j]=='L')
                    L++;
                else if(ch[j]=='O')
                    O++;
                else if(ch[j]=='V')
                    V++;
                else if(ch[j]=='E')
                    E++;
            }
            L+=l;
            O+=o;
            V+=v;
            E+=e;
            int sum=((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
            ar[i]=new arr(name,sum);
        }
        Arrays.sort(ar);
        sb.append(ar[0].name);
        System.out.println(sb);
    }

    static class arr implements Comparable<arr>{
        String name;
        int sum;
        public arr(String name, int sum){
            this.name=name;
            this.sum=sum;
        }

        @Override
        public int compareTo(arr o){
            if(o.sum==this.sum)
                return this.name.compareTo(o.name);
            return Integer.compare(o.sum,this.sum);
        }
    }
}
