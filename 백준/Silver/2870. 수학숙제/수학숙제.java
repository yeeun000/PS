import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        ArrayList<BigInteger> arr=new ArrayList<>();
        String s;
        for(int i=0;i<N;i++){
            String str=br.readLine();
            char ch[]=str.toCharArray();
            s="";
            for(int j=0;j<str.length();j++){
                if(ch[j]>47 && ch[j]<58){
                    s+=ch[j];
                }
                else{
                    if(!s.equals("")) {
                        arr.add(new BigInteger(s));
                        s="";
                    }
                }
            }
            if(!s.equals("")) {
                arr.add(new BigInteger(s));
            }
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            sb.append(arr.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
