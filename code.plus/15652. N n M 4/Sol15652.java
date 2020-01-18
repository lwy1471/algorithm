import java.util.Scanner;

class Sol15652 {

    static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] array = new int[N];
        go(array, N, M, 0);

        System.out.println(sb);
        sc.close();
    }

    static void go(int[] array, int N, int M, int index) {
        if(index>N)
            return;
        if(index==M) {
            for(int i=0;i<M;i++)
                sb.append(array[i]+" ");
            sb.append("\n");
            return;
        }

        for(int i=1;i<=N;i++) {
            if(index>0 && array[index-1] > i) 
                continue;
            array[index]=i;
            go(array, N, M, index+1);

        }
    }
}