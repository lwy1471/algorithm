import java.util.Arrays;
import java.util.Scanner;

class Sol10972 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i]=sc.nextInt();
        }

        // Arrays.sort(array);
        // do {
        //     for(int i=0;i<size;i++) {
        //         if(i+1==size)
        //             System.out.println(array[i]);
        //         else
        //             System.out.print(array[i]+" ");
        //     }
        // }while(nextPermutation(array)!=-1);

        // System.out.println();

        int res =  nextPermutation(array);
        if(res==-1)
            System.out.println("-1");
        else {
            for(int i=0;i<size;i++) {
                if(i+1==size)
                    System.out.println(array[i]);
                else
                    System.out.print(array[i]+" ");
            }
        }
    }

    static int nextPermutation(int[] array) {
        int size = array.length;
        int i=0;
        for(int k=1;k<size;k++) {
            if(array[k]>array[k-1])
                i=k;
        }
        if(i==0)
            return -1;

        int j=i;
        for(int k=i;k<size;k++) {
            if(array[i-1]<array[k])
                j=k;
        }
        swap(array, i-1, j);

        for(int k=0;k<(size-i)/2;k++) {
            swap(array, i+k, size-k-1);
        }
        return 1;
    }
    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}