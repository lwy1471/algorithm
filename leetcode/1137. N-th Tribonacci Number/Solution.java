class Solution {

    static int[] memory=new int[38];

    public static void main(String[] args) {
        memory[0]=0;
        memory[1]=1;
        memory[2]=1;
        System.out.println(tribonacci(4));
    }

    static int tribonacci(int n) {
        if (n==0) 
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 1;
        
        int n_1 = memory[n-1];
        int n_2 = memory[n-2];
        int n_3 = memory[n-3];
        if (n_1==0)  {
            n_1 = tribonacci(n-1);
            memory[n-1]=n_1;
        }
        if (n_2==0) {
            n_2 = tribonacci(n-2);
            memory[n-2]=n_2;
        }
        if (n_3==0) {
            n_3 = tribonacci(n-3);
            memory[n-3]=n_3;
        }

        return n_1+n_2+n_3;
    }

}