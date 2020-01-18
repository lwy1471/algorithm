import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;

class Sol15663 {

    static StringBuilder sb;
    static boolean[] check;
    static LinkedHashSet<String> set;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Integer[] arr = new Integer[N];
        Integer[] newArr = new Integer[N];
        check = new boolean[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }


        Arrays.sort(arr);
        
        set = new LinkedHashSet<>();
        go(arr, newArr, N, M, 0);

        String[] res = new String[set.size()];
        res = set.toArray(res);

        sb = new StringBuilder();
        for(String str: set) {
            System.out.println(str);
        }
        System.out.println(sb);

        sc.close();
    }

    static void go(Integer[] arr, Integer[] newArr, int N, int M, int index) {
        if(index>N)
            return;
        if(index==M) {
            sb = new StringBuilder();
            for(int i=0;i<M;i++) {
                if(i==M-1)
                    sb.append(newArr[i]);
                else
                    sb.append(newArr[i]+" ");
            }
            set.add(sb.toString());

            return;
        }
        
        for(int i=0;i<N;i++) {
            if(check[i])
                continue;
            
            check[i]=true;
            newArr[index]=arr[i];
            go(arr, newArr, N, M, index+1);
            check[i]=false;
        }

    }

}