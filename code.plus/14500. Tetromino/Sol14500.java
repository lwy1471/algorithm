import java.util.Scanner;

class Sol14500 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N+2][M+2];
        for(int i=0;i<=N+1;i++) {
            for(int j=0;j<=M+1;j++) {
                if(i==0 || j==0 || i==N+1 || j==M+1)
                    arr[i][j]=-1;
                else
                    arr[i][j] = sc.nextInt();    
            }
        }

        int max = -1;
        //start with 1,1
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=M;j++) {
                if(arr[i][j+1] !=-1 && arr[i+1][j] !=-1 && arr[i+1][j+1] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+1][j+1];
                    max = sum > max ? sum : max;
                }
                if(arr[i][j+1] !=-1 && arr[i][j+2] !=-1 && arr[i][j+3] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
                    max = sum > max ? sum : max;
                }
                if(arr[i+1][j] !=-1 && arr[i+2][j] !=-1 && arr[i+3][j] !=-1) {
                    int sum = arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j];
                    max = sum > max ? sum : max;
                }
                if(arr[i+1][j] !=-1 && arr[i+2][j] !=-1 && arr[i+1][j-1] !=-1) {
                    int sum = arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j-1];
                    max = sum > max ? sum : max;
                }
                if(arr[i+1][j] !=-1 && arr[i+1][j-1] !=-1 && arr[i+1][j+1] !=-1) {
                    int sum = arr[i][j]+arr[i+1][j-1]+arr[i+1][j-1]+arr[i+1][j+1];
                    max = sum > max ? sum : max;
                }
                if(arr[i][j+1] !=-1 && arr[i][j+2] !=-1 && arr[i+1][j+1] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1];
                    max = sum > max ? sum : max;
                }
                if(arr[i+1][j] !=-1 && arr[i+2][j] !=-1 && arr[i+1][j+1] !=-1) {
                    int sum = arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+1][j+1];
                    max = sum > max ? sum : max;
                }
                
                
                if(arr[i+1][j] !=-1 && arr[i+1][j+1] !=-1 && arr[i+2][j+1] !=-1) {
                    int sum = arr[i][j]+arr[i+1][j]+arr[i+1][j+1]+arr[i+2][j+1];
                    max = sum > max ? sum : max;
                }
                if(arr[i][j+1] !=-1 && arr[i-1][j+1] !=-1 && arr[i+1][j+2] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i-1][j+1]+arr[i+1][j+2];
                    max = sum > max ? sum : max;
                }
                if(arr[i+1][j] !=-1 && arr[i+1][j-1] !=-1 && arr[i+2][j-1] !=-1) {
                    int sum = arr[i][j]+arr[i+1][j]+arr[i+1][j-1]+arr[i+2][j-1];
                    max = sum > max ? sum : max;
                }
                if(arr[i][j+1] !=-1 && arr[i+1][j+1] !=-1 && arr[i+1][j+2] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
                    max = sum > max ? sum : max;
                }



                if(arr[i][j+1] !=-1 && arr[i][j+2] !=-1 && arr[i+1][j+2] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2];
                    max = sum > max ? sum : max;
                }
                if(arr[i+1][j] !=-1 && arr[i][j+1] !=-1 && arr[i][j+1] !=-1) {
                    int sum = arr[i][j]+arr[i|1][j]+arr[i][j+1]+arr[i][j+1];
                    max = sum > max ? sum : max;
                }
                if(arr[i][j+1] !=-1 && arr[i+1][j] !=-1 && arr[i+2][j] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+2][j];
                    max = sum > max ? sum : max;
                }
                if(arr[i][j+1] !=-1 && arr[i+1][j+1] !=-1 && arr[i+2][j+1] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+2][j+1];
                    max = sum > max ? sum : max;
                }

                //  ㄴ, ㄴ(반대), L(반대), L 할 차례
                if(arr[i+1][j] !=-1 && arr[i+1][j+1] !=-1 && arr[i+1][j+2] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
                    max = sum > max ? sum : max;
                }
                //
                //
                if(arr[i][j+1] !=-1 && arr[i+1][j+1] !=-1 && arr[i+1][j+2] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
                    max = sum > max ? sum : max;
                }
                if(arr[i][j+1] !=-1 && arr[i+1][j+1] !=-1 && arr[i+1][j+2] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
                    max = sum > max ? sum : max;
                }
                if(arr[i][j+1] !=-1 && arr[i+1][j+1] !=-1 && arr[i+1][j+2] !=-1) {
                    int sum = arr[i][j]+arr[i][j+1]+arr[i+1][j+1]+arr[i+1][j+2];
                    max = sum > max ? sum : max;
                }

            }
        }





        for(int i=0;i<=N+1;i++) {
            for(int j=0;j<=M+1;j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}