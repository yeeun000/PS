import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int j=0;j<N;j++) {
            String str = br.readLine();
            char ch[] = str.toCharArray();
            int s = 2015;
            int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,io=0,jo=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,so=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
            for (int i = 0; i < str.length(); i++) {
                if (ch[i] == 'A'&&a==0) {
                    a++;
                    s -= 65;
                }
                else if (ch[i] == 'B'&&b==0) {s -= 66;b++;}
                else if (ch[i] == 'C'&&c==0) {s -= 67;c++;}
                else if (ch[i] == 'D'&&d==0){ s -= 68;d++;}
                else if (ch[i] == 'E'&&e==0) {s -= 69;e++;}
                else if (ch[i] == 'F'&&f==0) {s -= 70;f++;}
                else if (ch[i] == 'G'&&g==0){ s -= 71;g++;}
                else if (ch[i] == 'H'&&h==0) {s -= 72;h++;}
                else if (ch[i] == 'I'&&io==0) {s -= 73;io++;}
                else if (ch[i] == 'J'&&jo==0){ s -= 74;jo++;}
                else if (ch[i] == 'K'&&k==0){ s -= 75;k++;}
                else if (ch[i] == 'L'&&l==0){ s -= 76;l++;}
                else if (ch[i] == 'M'&&m==0) {s -= 77;m++;}
                else if (ch[i] == 'N'&&n==0){ s -= 78;n++;}
                else if (ch[i] == 'O'&&o==0) {s -= 79;o++;}
                else if (ch[i] == 'P'&&p==0) {s -= 80;p++;}
                else if (ch[i] == 'Q'&&q==0){ s -= 81;q++;}
                else if (ch[i] == 'R'&&r==0) {s -= 82;r++;}
                else if (ch[i] == 'S'&&so==0){ s -= 83;so++;}
                else if (ch[i] == 'T'&&t==0){ s -= 84;t++;}
                else if (ch[i] == 'U'&&u==0) {s -= 85;u++;}
                else if (ch[i] == 'V'&&v==0) {s -= 86;v++;}
                else if (ch[i] == 'W'&&w==0){ s -= 87;w++;}
                else if (ch[i] == 'X'&&x==0) {s -= 88;x++;}
                else if (ch[i] == 'Y'&&y==0) {s -= 89;y++;}
                else if (ch[i] == 'Z'&&z==0) {s -= 90;z++;}
            }
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
