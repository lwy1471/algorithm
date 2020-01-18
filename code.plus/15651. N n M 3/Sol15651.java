import java.util.Scanner;

class Sol15651 {

    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] array = new int[N];
        go(array, 0, N, M);

        System.out.println(sb);


        sc.close();
    }

    static void go(int[] array, int index, int N, int M) {
        if(index > N)
            return;

        if(index == M) {
            for(int i=0;i<M;i++)
                sb.append(array[i]+" ");
            sb.append("\n");
            return;
        }

        for (int i=1;i<=N;i++) {
            array[index]=i;
            go(array, index+1, N, M);
        }
    }

}