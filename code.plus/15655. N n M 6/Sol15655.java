import java.util.Scanner;
import java.util.Arrays;

class Sol15655 {

    static StringBuilder sb;
    static boolean[] check;
    public static void main(String[] args) {
        sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        check = new boolean[N];
        int[] arr = new int[N];
        int[] newArr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);

        go(arr, newArr, N, M, 0);
        System.out.println(sb);
        sc.close();
    }

    static void go(int[] arr, int[] newArr, int N, int M, int index) {
        if(index>N)
            return;
        if(index==M) {
            for(int i=0;i<M;i++)
                sb.append(newArr[i]+" ");
            sb.append("\n");
            return;
        }
        
        for(int i=0;i<N;i++) {
            if(check[i])
                continue;
            if(index!=0&& newArr[index-1] > arr[i])
                continue;
            check[i]=true;
            newArr[index]=arr[i];
            go(arr, newArr, N, M, index+1);
            check[i]=false;
        }

    }

}