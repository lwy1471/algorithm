import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution9613 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        List<Long> res = new ArrayList<>();
        for(int i=0;i<size;i++)    {
            long sum=0;
            int lineSize = scan.nextInt();
            List<Integer> arr = new ArrayList<>();
            for(int j=0;j<lineSize;j++) {
                arr.add(scan.nextInt());
            }

            for(int k=0;k<lineSize;k++) {
                for(int l=k+1;l<lineSize;l++) {
                    int a = arr.get(k);
                    int b = arr.get(l);
                    sum+=gcd(a, b);
                }
            }
            res.add(sum);
        }
        scan.close();
        for(int i=0;i<size;i++)    {
            System.out.println(res.get(i));
        }
    }

    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }
}