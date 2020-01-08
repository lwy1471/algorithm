
import java.util.Arrays;
import java.util.Scanner;

class Sol1759 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int alphaSize = sc.nextInt();
        char[] alphaCharArr = new char[alphaSize];

        for(int i=0;i<alphaSize;i++)
            alphaCharArr[i]=sc.next().charAt(0);

        Arrays.sort(alphaCharArr);
        //System.out.println(new StringBuilder(new String(alphaCharArr)));

        String alpha = new String(alphaCharArr);
        rec(alpha, n, 0, "");

        sc.close();
    }

    public static void rec(String alphaCharArr, int n, int index, String passwd) {
        if(passwd.length()==n) {
            if(check(passwd))
                System.out.println(passwd);
            return ;
        }
        if(index>=alphaCharArr.length())
            return ;

        String newPasswd = passwd+alphaCharArr.charAt(index);
        rec(alphaCharArr, n, index+1, newPasswd );
        rec(alphaCharArr, n, index+1, passwd );
    }

    public static boolean check(String passwd) {
        int moum=0;
        int jaum=0;
        for (int i=0;i<passwd.length();i++) {
            char target = passwd.charAt(i);
            if(target=='a' || target=='o' || target=='i' || target=='u' || target=='e') {
                moum=moum+1;
            }
            else {
                jaum=jaum+1;
            }
        }
        if(moum>=1 && jaum>=2)
            return true;
        else
            return false;
    }


}