import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.SourceDataLine;

class Solution {

    public static void main(String[] args) {
        
        Map<String, Object> input = new HashMap<>();

        int L = 7;
        int R = 15;
        Integer[] arr = {10,5,15,3,7,null,18};
        List<Integer> inputList=Arrays.asList(arr);

        input.put("root", inputList);
        input.put("L", L);
        input.put("R", R);

        TreeNode tree = makeTree(inputList, 0, inputList.size());

        int res = retriveTree(tree, L, R);
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

    private static int retriveTree(TreeNode tree, int left, int right) {
        if (tree==null) {
            return 0;
        }
        int sum=0;
        if (tree.val >= left && tree.val <= right)
            sum += tree.val;
        
        return sum + retriveTree(tree.left, left, right) + retriveTree(tree.right, left, right);
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