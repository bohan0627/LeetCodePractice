import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public PathSumII() {
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        List<Integer> l = new ArrayList<>();
        l.add(root.val);
        dfs(root,sum-root.val,res,l);
        return res;
    }
    private void dfs(TreeNode n,int sum,List<List<Integer>> res, List<Integer> l){
        if(n.left==null&&n.right==null&&sum==0){
            List<Integer> temp = new ArrayList<>();
            temp.addAll(l);
            res.add(temp);
        }
        if(n.left!=null){
            l.add(n.left.val);
            dfs(n.left,sum-n.left.val,res,l);
            l.remove(l.size()-1);
        }
        if(n.right!=null){
            l.add(n.right.val);
            dfs(n.right,sum-n.right.val,res,l);
            l.remove(l.size()-1);
        }
    }
}
