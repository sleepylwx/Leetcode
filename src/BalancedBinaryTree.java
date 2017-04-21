import util.TreeNode;

/**
 * Created by 36249 on 2017/1/31.
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root){

        if(root == null){

            return true;
        }
        return getDeepth(root) != -1;
    }

    private int getDeepth(TreeNode root){

        if(root == null){

            return 0;
        }
        int left = getDeepth(root.left);
        if(left == -1){

            return -1;
        }
        int right = getDeepth(root.right);
        if(right == -1){

            return -1;
        }
        if(Math.abs(left - right)  > 1){

            return -1;
        }

        return Math.max(left,right) + 1;

    }
}
