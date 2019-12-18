import java.util.Arrays;
import java.util.Scanner;

class Sol2309 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] dwarfs = new int[10];
        
        for(int i=1;i<10;i++) {
            dwarfs[i] = sc.nextInt();
            dwarfs[0]+=dwarfs[i];
        }

        int[] res = new int[7];
        int cnt=0;
        for(int i=1;i<10 && res[0]==0;i++) {
            for(int j=i+1;j<10;j++) {
                if( (dwarfs[i]+dwarfs[j])==(dwarfs[0]-100) ) {
                    for(int k=1;k<10;k++) {
                        if(k==i || k==j)
                            continue;
                        res[cnt++]=dwarfs[k];
                    }
                    Arrays.sort(res);
                    break;
                }
            }
        }
        for(cnt=0;cnt<7;cnt++)
            sb.append(res[cnt]+"\n");
        System.out.println(sb);
        sc.close();         
        return ;
    }
}