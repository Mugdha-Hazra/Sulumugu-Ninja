/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int qLen = q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=1;i<=qLen;i++)
            {
                
            TreeNode temp=q.poll();

            ans.add(temp.val);
            if(temp.left!=null)
            q.offer(temp.left);
            if(temp.right!=null)
            q.offer(temp.right);
            }
            list.add(ans);
        }

        return list;    
    }
    
}
