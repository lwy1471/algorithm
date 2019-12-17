class Solution2609 {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 18;

        int a = Integer.max(num1, num2);
        int b = Integer.min(num1, num2);

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
        
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