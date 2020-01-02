import java.util.Arrays;
import java.util.Scanner;

class Solution10974 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        int[] array = new int[N];
        for (int i=0;i<N;i++) {
            array[i]=i+1;
        }
        Arrays.sort(array);
        do {
            for(int i=0;i<N;i++) {
                sb.append(array[i]+" ");
            }
            sb.append("\n");
        }while(nextPermutation(array));

        System.out.println(sb);
        sc.close();
    }

    static boolean nextPermutation(int[] array) {
        int size = array.length;
        int i=size-1;
        while (i>0 && array[i-1] >= array[i]) i=i-1;
        
        if(i<=0)
            return false;

        int j=size-1;
        while (array[i-1] >= array[j]) j=j-1;
        swap(array, i-1, j);

        j=size-1;
        while (i < j) {
            swap(array, i, j);
            i++; j--;
        }
        return true;
    }
    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}