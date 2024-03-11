import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int a=array.length/2;
        Arrays.sort(array);
        answer=array[a];
        return answer;
    }
}