import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import util.TreeNode;

public class RangeSumBST {

    /**
     * recuresive method is faster than iterative way,why?
     * @param root
     * @param L
     * @param R
     * @return
     */
    public int rangeSumBST(TreeNode root, int L, int R) {


        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        int res = 0;
        while(!queue.isEmpty()){


            TreeNode current = queue.poll();

            if(current.val >= L && current.val <= R){

                res += current.val;

            }

            if(current.val > L && current.left != null){

               queue.offer(current.left);
            }

            if(current.val < R && current.right != null){


                queue.offer(current.right);
            }


        }

        return res;

    }





}
