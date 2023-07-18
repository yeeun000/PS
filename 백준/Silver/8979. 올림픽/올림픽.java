import java.io.*;
import java.util.*;
public class Main {
    static Arr[] ar;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        ar=new Arr[N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            int sum=a+b+c;
            ar[i]=new Arr(num,a,b,c,sum);
        }
        Arrays.sort(ar);
        int cnt=1;
        int x=0;
        int qwer=0;
        for(int i=0;i<N;i++){
            if(ar[i].sum==-1) {
                qwer++;
                ar[i].sum=-2;
                x++;
                continue;
            }
            if(x!=0){
                i=i-x;
            }
            if(ar[i].num==K) {
                sb.append(cnt);
                break;
            }
            if(ar[i].sum!=-2) {
                if(qwer!=0) {
                    cnt += qwer;
                    qwer=0;
                }
                cnt++;
            }
            x=0;
        }
        System.out.println(sb);
    }
    static class Arr implements Comparable<Arr>{
        int num,a,b,c,sum;
        public Arr(int num, int a, int b, int c,int sum){
            this.num=num;
            this.a=a;
            this.b=b;
            this.c=c;
            this.sum=sum;
        }

        @Override
        public int compareTo(Arr o){
            if(o.a==this.a){
                if(o.b==this.b){
                    if(o.c==this.c){
                        return this.sum=-1;
                    }
                    return Integer.compare(o.c,this.c);
                }
                return Integer.compare(o.b,this.b);
            }
            return Integer.compare(o.a,this.a);
        }
    }
}
