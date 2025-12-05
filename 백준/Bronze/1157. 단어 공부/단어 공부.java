
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    static char[] ch;
  //  static ArrayList<Integer> in=new ArrayList<>();
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      String str = br.readLine().toUpperCase();
      char ch[]=str.toCharArray();
      Arrays.sort(ch);

      int cnt=0;
      int max=0;
      char c = ch[0];
      for(int i=1;i<ch.length;i++){
          if(ch[i]==ch[i-1]){
              cnt++;
              if(i==ch.length-1){
                  if(cnt>max){
                      max=cnt;
                      c=ch[i-1];
                      cnt=0;
                  }
                  else if(cnt==max){
                      c='?';
                      cnt=0;
                  }
                  else cnt=0;
              }
          }
          else{
              if(cnt>max){
                  max=cnt;
                  c=ch[i-1];
                  cnt=0;
              }
              else if(cnt==max){
                  c='?';
                  cnt=0;
              }
              else cnt=0;
          }
      }
        sb.append(c);
        System.out.println(sb);
    }
}
