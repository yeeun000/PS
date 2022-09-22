
import java.util.*;
import java.io.*;

public class Main {
    static int A, B;

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

            while (sc.hasNextInt()) {
                A = sc.nextInt();
                B = sc.nextInt();
                int Sum = A + B;

                System.out.println(Sum);
            }

        }

    }

