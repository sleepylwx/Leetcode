import sun.reflect.generics.tree.Tree;
import util.TreeNode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 36249 on 2016/11/26.
 */
public class SameTree {


    public boolean isSameTree(TreeNode p, TreeNode q) {


        if(p == null && q == null){

            return true;
        }
        else if(p == null || q == null){

            return false;
        }
        else if(p.val != q.val){
            return false;
        }

        if(isSameTree(p.left,q.left) && isSameTree(p.right,q.right)){

            return true;
        }

        return false;
    }


}
