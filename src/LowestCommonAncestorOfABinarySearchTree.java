import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2017/1/19.
 */
public class LowestCommonAncestorOfABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){

        if(root == null){

            return null;
        }
        if(root.val < Math.min(p.val,q.val)){

            return lowestCommonAncestor(root.right,p,q);
        }
        else if(root.val > Math.max(p.val,q.val)){

            return lowestCommonAncestor(root.left,p,q);
        }
        return root;
    }


}
