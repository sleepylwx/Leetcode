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

    public int rangeSumBST1(TreeNode root, int L, int R){


        if(root == null){

            return 0;
        }

        int res = 0;

        if(root.val >=L && root.val <= R){

            res += root.val;
        }

        if(root.val > L){

            res += rangeSumBST1(root.left,L,R);
        }

        if(root.val < R){

            res += rangeSumBST1(root.right,L,R);
        }

        return res;
    }


    public int rangeSumBST2(TreeNode root, int L, int R){


        Stack<TreeNode> stack = new Stack<>();
        int res = 0;

        stack.push(root);

        TreeNode checkedMark = root; //if checkedMark == current ,it means the node has not been visited. else means it has benn visited.
        while(!stack.empty()){

            TreeNode current = stack.peek();
            if(checkedMark == current && current.val > L && current.left != null){

                stack.push(current.left);
                checkedMark = current.left;
            }
            else{

                if(current.val >= L && current.val <= R){

                    res += current.val;
                }

                stack.pop();

                if(current.val < R && current.right != null){

                    stack.push(current.right);
                    checkedMark = current.right;

                }
            }

        }


        return res;
    }





}
