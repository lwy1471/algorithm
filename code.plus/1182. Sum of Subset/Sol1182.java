import java.util.Scanner;

class Sol1182 {

    static int cnt=0;
    static int S=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        S = sc.nextInt();

        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i]=sc.nextInt();
        }
        int[] subset = new int[size];
        recur(array, subset, 0, 0);
        System.out.println(cnt);
        sc.close();
    }

    static void recur(int[] array, int[] subset, int index, int now) {
        if(index>=array.length)
            return;

        subset[now]=array[index];
        if(check(subset, now+1))
           cnt=cnt+1; 

        recur(array, subset, index+1, now+1);
        recur(array, subset, index+1, now);
    }

    static boolean check(int[] subset, int size) {
        int sum=0;
        for(int i=0;i<size;i++)
            sum=sum+subset[i];
        if(sum==S)
            return true;
        else
            return false;
    }
}