import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        while(!str.equals("end")){
            sb.append("<").append(str).append("> is ");
            int cnt=0;
            int a=0;
            int b=0;
            int qwer=0;
            char ch[]=str.toCharArray();
            for(int i=0;i<str.length();i++){
                if(i!=0){
                    if(ch[i-1]==ch[i]){
                        if(ch[i]!='e' && ch[i]!='o') {
                            qwer++;
                            break;
                        }
                    }
                }
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
                    cnt++;
                    a++;
                    b=0;
                }
                else {
                    a=0;
                    b++;
                }
                if(a>2 || b>2){
                    qwer++;
                    break;
                }
            }
            if(qwer==0 && cnt>0){
                sb.append("acceptable.");
            }
            else{
                sb.append("not acceptable.");
            }
            sb.append("\n");
            str=br.readLine();
        }
        System.out.println(sb);
    }
}
