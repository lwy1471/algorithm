import java.util.Scanner;

class Sol15649 {
    
    static boolean[] check;
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        M = sc.nextInt();


        int[] array = new int[N];
        check = new boolean[N+1];
        for(int i=0;i<N;i++)
            array[i]=i+1;

        int[] sequence = new int[N];
        recur(array, sequence, 0, 0);
        System.out.println(sb);
        sc.close();
    }


    static void recur(int[] array, int[] sequence, int index, int seq_index) {
        if(seq_index==M) {
            for(int i=0;i<M;i++) {
                sb.append(sequence[i]+" ");
            }
            sb.append("\n");
            return;
        }
        if(index>=array.length)
            return;
    
        for(int i=0;i<array.length;i++) {
            int now = array[i];
            if(check[now])
                continue;
            else {
                check[now]=true;
                sequence[seq_index]=now;
                recur(array, sequence, index+1, seq_index+1);
                check[now]=false;
            }
        }
    }
}