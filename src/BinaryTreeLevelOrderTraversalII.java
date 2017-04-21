import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by 36249 on 2017/1/20.
 */
public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        if(root == null){

            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 1;
        int cur = 0;
        int childCount = 0;
        temp.add(new ArrayList<>());
        int level = 0;
        while(!queue.isEmpty()){

            ++cur;
            TreeNode node = queue.poll();
            temp.get(level).add(node.val);
            if(node.left != null){

                queue.offer(node.left);
                ++childCount;
            }
            if(node.right != null){

                queue.offer(node.right);
                ++childCount;
            }
            if(cur == sum){

                cur = 0;
                sum = childCount;
                childCount = 0;
                temp.add(new ArrayList<>());
                ++level;
            }
        }
        int length = temp.size() - 1;
        for(int i = 0 ; i < length; ++i){

            result.add(temp.get(length - 1 - i));
        }

        return result;
    }

    public List<List<Integer>> levelOrderBottom0(TreeNode root){

        List<List<Integer>> temp = new ArrayList<>();
        DFS(temp,root,1);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < temp.size(); ++i){

            result.add(temp.get(temp.size()-i-1));
        }
        return result;
    }
    private void DFS(List<List<Integer>> result,TreeNode root,int level){

        if(root == null){

            return;
        }

        if(level > result.size()){

            result.add(new ArrayList<>());
        }

        result.get(level-1).add(root.val);
        DFS(result,root.left,level+1);
        DFS(result,root.right,level+1);
    }
}
