
import util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 36249 on 2017/1/13.
 */
public class PathSumIII {


    public int pathSum0(TreeNode root,int sum){

        if(root == null){

            return 0;
        }

        return resolve0(root,sum) + pathSum0(root.left,sum) + pathSum0(root.right,sum);
    }

    private int resolve0(TreeNode root,int sum){

        int res = 0;
        if(root == null){

            return res;
        }
        if(root.val == sum){
            ++res;
        }
        res += resolve0(root.left,sum-root.val);
        res += resolve0(root.right,sum-root.val);

        return res;
    }

    public int pathSum(TreeNode root,int sum){

        if(root == null){

            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        return resolve(root,0,sum,map);
    }

    private int resolve(TreeNode root,int sum,int target,Map<Integer,Integer> map){

        int res = 0;
        if(root == null){

            return 0;
        }

        sum += root.val;
        res = map.getOrDefault(sum-target,0);
        map.put(sum,map.getOrDefault(sum,0) + 1);
        res += resolve(root.left,sum,target,map) + resolve(root.right,sum,target,map);
        map.put(sum,map.get(sum) - 1);
        return res;
    }
}
