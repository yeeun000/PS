
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        if(N>=620)
            sb.append("Red");
        else if(N>=590)
            sb.append("Orange");
        else if(N>=570)
            sb.append("Yellow");
        else if(N>=495)
            sb.append("Green");
        else if(N>=450)
            sb.append("Blue");
        else if(N>=425)
            sb.append("Indigo");
        else
            sb.append("Violet");
        System.out.println(sb);
    }
}
