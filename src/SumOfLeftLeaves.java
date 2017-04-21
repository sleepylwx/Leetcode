import util.TreeNode;

/**
 * Created by 36249 on 2016/11/25.
 */
public class SumOfLeftLeaves {

    int flag = 1;
    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null){

            return 0;
        }
        if(root.left == null && root.right == null && flag == 0){

            return root.val;
        }

        flag = 0;
        int lsum = sumOfLeftLeaves(root.left);
        flag = 1;
        int rsum = sumOfLeftLeaves(root.right);

        return lsum + rsum;
    }
}


