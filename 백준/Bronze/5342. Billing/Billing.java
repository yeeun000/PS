import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        double cnt=0;
        while(!str.equals("EOI")){
            if(str.equals("Paper"))
                cnt+=57.99;
            else if(str.equals("Printer"))
                cnt+=120.50;
            else if(str.equals("Planners"))
                cnt+=31.25;
            else if(str.equals("Binders"))
                cnt+=22.50;
            else if(str.equals("Calendar"))
                cnt+=10.95;
            else if(str.equals("Notebooks"))
                cnt+=11.20;
            else cnt+=66.95;
            str=br.readLine();
        }
        System.out.printf("$%.2f",cnt);
    }
}
