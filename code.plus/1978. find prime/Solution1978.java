import java.util.Scanner;

class Solution1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int sum=0;
        for (int i=0;i<size;i++) {
            int num = scan.nextInt();
            if(prime(num))
                sum++;

        }
        System.out.println(sum);
        scan.close();
    }

    static boolean prime(int num) {
        if (num==1)
            return false;
        for (int i=2;i<num;i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }
}