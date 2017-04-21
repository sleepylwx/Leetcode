import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2017/1/31.
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root){

        if(root == null){

            return true;
        }
        if(root.left == null && root.right == null){

            return true;
        }
        List<List<Integer>> res = new ArrayList<>();
        getRes(root,1,res);
        for(int i = 1 ; i <res.size() ; ++i){

            List<Integer> temp = res.get(i);
            for(int j = 0;j < temp.size()/2; ++j){

                if(temp.get(j) != temp.get(temp.size()-j-1)){

                    return false;
                }
            }
        }

        return true;
    }

    private void getRes(TreeNode root,int level, List<List<Integer>> res){

        if(level > res.size()){

            res.add(new ArrayList<>());
        }
        if(root == null){

            res.get(level-1).add(null);
            return;
        }

        res.get(level-1).add(root.val);
        getRes(root.left,level+1,res);
        getRes(root.right,level+1,res);
    }

    public boolean isSymmetric0(TreeNode root){

        if(root == null){

            return true;
        }
        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode left,TreeNode right){

        if(left == null && right == null){

            return true;
        }
        if(left == null || right == null){

            return false;
        }
        return left.val == right.val && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }

}
