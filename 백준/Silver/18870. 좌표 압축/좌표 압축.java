import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static int[] a;
    static int [] a_s;
    static ArrayList<Integer> ar = new ArrayList<>();
    static int N;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        a_s=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            a_s[i]=arr[i];
        }
        Arrays.sort(a_s);
        ar.add(a_s[0]);
        for(int i=1;i<N;i++){
            if (a_s[i] != a_s[i - 1])
                ar.add(a_s[i]);
        }
        a = new int[ar.size()];
        for (int j = 0; j < ar.size(); j++) {
            a[j] = ar.get(j);
        }
        logic();
    }

    static void logic() {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            cnt = binarySearch(a, 0, ar.size() - 1, arr[i]);
            sb.append(cnt).append(" ");
        }
        System.out.println(sb);
    }

    static int binarySearch(int[] a, int L, int R, int X) {
        while (L <= R) {
            int mid = (L + R) / 2;
            if (a[mid] == X) {
                return mid;
            } else if (a[mid] < X) {
                L = mid + 1;
            } else if (a[mid] > X) {
                R = mid - 1;
            }
        }
        return X;
    }
}
