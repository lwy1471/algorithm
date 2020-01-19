import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Sol1260 {
    static boolean[] check;
    static ArrayList[] graph;
    static int cnt=0;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();

        graph = new ArrayList[N+1];
        check = new boolean[N+1];
        for(int i=1;i<=N;i++) {
            ArrayList<Integer> vert = new ArrayList<>();
            graph[i]=vert;
        }
        for(int i=0;i<M;i++) {
            int node = sc.nextInt();
            Integer nextNode = sc.nextInt();
            graph[node].add(nextNode);
            graph[nextNode].add(node);
        }

        dfs(start, graph[start]);
        System.out.println();

        cnt=0;
        Arrays.fill(check, false);
        bfs(start);
        System.out.println();
        sc.close();
    }

    static void bfs(int node) {
        LinkedList<Integer> que = new LinkedList<>();
        que.add(node);
        check[node]=true;
        while(true) {
            if(que.isEmpty())
                break;

            int nextNode = que.pop();
            System.out.print(nextNode+" ");
            
            ArrayList<Integer> nodeList = graph[nextNode];
            for(Integer num : nodeList ) {
                if(check[num]==false) {
                    check[num]=true;
                    que.add(num);
                }

            }  
         
        }

    }




    static void dfs(int node, ArrayList<Integer> nodeList) {
        if(check[node])
            return;

        check[node]=true;
        System.out.print(node+" ");
        for(int i=0;i<nodeList.size();i++) {
            if(nodeList.isEmpty())
                continue;
            Integer nextNode = nodeList.get(i);
            if(!check[nextNode]) {
                dfs(nextNode, graph[nextNode]);
            }
        }

    }
}