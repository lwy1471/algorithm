import java.util.Scanner;

class Sol9095_Reccurent {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int size = sc.nextInt();

        for(int i=0;i<size;i++) {
            int num = sc.nextInt();
            sb.append(recur(num)+"\n");
        }
        System.out.println(sb);
        sc.close();
    }

    public static int recur(int num) {
        if(num<0)
            return 0;
        if(num==0)
            return 1;

        return recur(num-1)+recur(num-2)+recur(num-3);

    }

    public static int recur2(int num, int goal) {
        if(num>goal)
            return 0;
        if(num==goal)
            return 1;
        int sum=0;
        for(int i=1;i<=3;i++) {
            sum += recur2(num+i, goal);
        }
        return sum;
    }
}