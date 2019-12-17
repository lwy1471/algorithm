import java.util.Arrays;
import java.util.List;

class Solution {
    final static int INF=Integer.MAX_VALUE;
    public static void main(String[] args) {

        // Integer[] arr = {4,2,6,1,3,null,null};
        // Integer[] arr = {1,0,48,null,null,12,49,null,null,null,null};
        Integer[] arr = {27,null,34,null,58,50,null,44,null,null,null};
        List<Integer> inputList=Arrays.asList(arr);
        
        TreeNode tree = makeTree(inputList, 0, inputList.size());

        int res = retriveTree(tree);
        System.out.println(res);

    }

    private static TreeNode makeTree(List<Integer> inputList, int start, int end) {
        if (start > inputList.size()-1 || inputList.get(start)==null)
            return null;

        TreeNode resTree = new TreeNode(inputList.get(start));
        resTree.left = makeTree(inputList, start*2+1, end);
        resTree.right = makeTree(inputList, start*2+2, end);

        return resTree;
    }

    private static int retriveTree(TreeNode tree) {
        if (tree == null) 
            return INF;

        int left = retriveTree(tree.left);
        int right = retriveTree(tree.right);

        int a = tree.left == null ? tree.val : Math.abs(tree.val-tree.left.val);
        int b = tree.right == null ? tree.val : Math.abs(tree.val-tree.right.val);
        int min = Integer.min(a, b);

        return Integer.min(min, Integer.min(left, right));
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) {
         val = x;
     }
}