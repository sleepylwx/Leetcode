import util.TreeNode;

/**
 * Created by 36249 on 2016/11/25.
 */



public class InvertBinaryTree {


    public TreeNode invertTree(TreeNode root) {

        if(root == null){

            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}


