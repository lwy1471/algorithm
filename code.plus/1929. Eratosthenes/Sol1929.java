import java.util.Arrays;
import java.util.Scanner;

class Sol1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int M = scan.nextInt();
        int N = scan.nextInt();
        
        StringBuilder sb = new StringBuilder();
        boolean[] sieve = new boolean[N+1];
        Arrays.fill(sieve, true);
        sieve[1]=false;
        

        for(int i=2;i<=N;i++) {
            if(!sieve[i])
                continue;
            else {
                for(int j=2; i*j<=N; j++) {
                    if(i*j>=N+1)
                        break;
                    sieve[i*j]=false;
                }
            }
        }
        for(int i=M;i<=N;i++) {
            if(sieve[i])
                sb.append(i+"\n");
        }
        System.out.println(sb);
        
        scan.close();
    }
}