class Fibonacci {
    public static void main(String[] args) {
        
        int n = 6;
        System.out.println(fibonacci(n));

        int[] array = new int[100];
        array[0]=0;
        array[1]=1;
        fibonacci2(array, n, 2);
        System.out.println(array[n]);
        int[] array2 = new int[100];
        System.out.println(fibonacci3(array2, n));
    }

    static int fibonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static void fibonacci2(int[] array, int n, int cnt) {
        if(n<cnt)
            return ;
        array[cnt]=array[cnt-1]+array[cnt-2];
        fibonacci2(array, n, cnt+1);
    }

    static int fibonacci3(int[] array, int n) {
        array[0]=0;
        array[1]=1;
        for(int i=2;i<=n;i++) {
            array[i]=array[i-1]+array[i-2];
        }
        return array[n];
    }
}