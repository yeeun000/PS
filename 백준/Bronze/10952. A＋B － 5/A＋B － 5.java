
import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int A,B;
        while(sc.hasNextInt()){
            A=sc.nextInt();
            B=sc.nextInt();
            if(A==0 && B==0)
                break;
            else{
                int Sum=A+B;
                System.out.println(Sum);
            }
        }
    }
}
