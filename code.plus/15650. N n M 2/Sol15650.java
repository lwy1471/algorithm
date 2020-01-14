import java.util.Scanner;

class Sol15650 {

    static boolean[] check;
    static int[] seq;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int N = sc.nextInt();
        int M = sc.nextInt();

        seq = new int[N];
        check = new boolean[N+1];

        go(M,N,0,1);
        System.out.println(sb);
        sc.close();
    }

    static void go(int M, int N, int index, int start) {
        if(index==M) {
            for(int i=0;i<M;i++)
                sb.append(seq[i]+" ");
            sb.append("\n");
            return ;
        }
        
        for(int i=start;i<=N;i++) {
            if(check[i])
                continue;
            
            check[i]=true;
            seq[index]=i;
            go(M, N, index+1, i+1);
            check[i]=false;
        }


    }
}