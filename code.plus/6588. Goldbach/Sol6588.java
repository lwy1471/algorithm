import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sol6588 {
    public static void main(String[] args) throws IOException {

        
        int N=1000001;
        boolean[] sieve = new boolean[N+1];
        
        for(int i=2;i<=N;i++) {
            if(!sieve[i])   {
                for(int j=i+i; j<=N; j=j+i) {
                    sieve[j]=true;
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=0;
        while(true) {
            num=Integer.parseInt(br.readLine());
            if(num==0)
                break;

            for(int i=2;i<=num;i++) {
                if(!sieve[i] && !sieve[num-i]) {
                        System.out.printf("%d = %d + %d\n",num, i, num-i);
                        break;
                    }
                }
        }
   
    }
}