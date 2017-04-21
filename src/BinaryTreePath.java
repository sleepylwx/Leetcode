import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2017/3/3.
 */
public class BinaryTreePath {


    public List<String> binaryTreePaths(TreeNode root){

        List<Integer> arr = new ArrayList<>();
        List<String> result = new ArrayList<>();
        if(root == null){

            return result;
        }
        String temp = ""+root.val;
        if(root.left == null && root.right == null){

            result.add(temp);
            return result;
        }
        recursion(root.left,temp,result);
        recursion(root.right,temp,result);
        return result;
    }

    private void recursion(TreeNode root,String temp,List<String> result){

        if(root == null){

            return;
        }
        String nextTemp  = temp + "->" + root.val;
        if(root.left == null && root.right == null){

            result.add(nextTemp);
            return;
        }

        recursion(root.left,nextTemp,result);
        recursion(root.right,nextTemp,result);
    }


}
