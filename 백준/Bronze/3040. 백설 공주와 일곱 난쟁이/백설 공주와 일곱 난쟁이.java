import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int arr[]=new int [9];
        for(int i=0;i<9;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        int s=0;

        for(int a=0;a<3;a++){
            for(int b=a+1;b<4;b++){
                for(int c=b+1;c<5;c++){
                    for(int d=c+1;d<6;d++){
                        for(int e=d+1;e<7;e++){
                            for(int f=e+1;f<8;f++){
                                for(int g=f+1;g<9;g++){
                                    s=arr[a]+arr[b]+arr[c]+arr[d]+arr[e]+arr[f]+arr[g];
                                    if(s==100){
                                        sb.append(arr[a]+"\n"+arr[b]+"\n"+arr[c]+"\n"+arr[d]+"\n"+arr[e]+"\n"+arr[f]+"\n"+arr[g]);
                                        break;
                                    }
                                }
                                if(s==100){
                                    break;
                                }
                            }
                            if(s==100){
                                break;
                            }
                        }
                        if(s==100){
                            break;
                        }
                    }
                    if(s==100){
                        break;
                    }
                }
                if(s==100){
                    break;
                }
            }
            if(s==100) {
                break;
            }
        }
        System.out.println(sb);
    }
}
