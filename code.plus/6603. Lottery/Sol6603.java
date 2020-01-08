import java.util.Scanner;

class Sol6603 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int k_size=0;
        while( (k_size=sc.nextInt()) != 0) {
            int[] k_array = new int[k_size];
            for(int i=0;i<k_size;i++) {
                k_array[i]=sc.nextInt();
            }
            int[] lotto = new int[6];
            go(k_array, lotto, 0, 0);
            System.out.println();
        }

        sc.close();

    }

    static void go(int[] k_array, int[] lotto, int index, int lotto_cnt) {
        if(lotto_cnt==6) {
            for (int i=0;i<6;i++)
                System.out.print(Integer.toString(lotto[i])+" ");
            System.out.println();
            return ;
        }
        if(index>=k_array.length)
            return ;
        lotto[lotto_cnt]=k_array[index];
        go(k_array, lotto, index+1, lotto_cnt+1);
        go(k_array, lotto, index+1, lotto_cnt);

    }
}