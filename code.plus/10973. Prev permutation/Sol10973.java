import java.util.Scanner;

class Sol10973 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
            array[i]=sc.nextInt();
        }

        if(!nextPermutation(array))
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

    static boolean nextPermutation(int[] array) {
        int size = array.length;
        int i=size-1;
        while (i>0 && array[i-1] <= array[i]) i=i-1;
        
        if(i<=0)
            return false;

        int j=size-1;
        while (array[i-1] <= array[j]) j=j-1;
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