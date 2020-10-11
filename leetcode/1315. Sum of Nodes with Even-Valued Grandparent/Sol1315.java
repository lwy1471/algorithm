import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Sol1315 {
    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
    
        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
    
        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            
            int ret = new Solution1315Func().sumEvenGrandparent(root);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

class Solution1315Func {
    int size = 0;
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {

        preOrder(root, null, null);
        return sum;
    }

    void preOrder(TreeNode now, TreeNode parent, TreeNode grandParent) {
        if(now==null)
            return;

        if(grandParent != null && (grandParent.val%2==0)) {
            sum = sum + now.val;
        }
        preOrder(now.left, now, parent);
        preOrder(now.right, now, parent);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class NewTreeNode {
    int val;
    NewTreeNode left;
    NewTreeNode right;
    NewTreeNode parent;
    
    NewTreeNode oldToNew(TreeNode old) {
        if(old==null)
            return null;
        NewTreeNode newNode = new NewTreeNode();
        newNode.val = old.val;
        newNode.left = oldToNew(old.left);
        newNode.right = oldToNew(old.right);
        return newNode;
    }
}