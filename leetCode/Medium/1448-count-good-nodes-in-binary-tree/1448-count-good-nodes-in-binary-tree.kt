/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    
    fun dfs(prevMax: Int, treeNode: TreeNode?): Int {
        if(treeNode == null) return 0
        
        var goodNodesCnt = 0
        var max = prevMax
        if(prevMax <= treeNode.`val`) {
            goodNodesCnt += 1
            max = treeNode.`val`
        }
        
        goodNodesCnt += dfs(max, treeNode.left)
        goodNodesCnt += dfs(max, treeNode.right)
        
        return goodNodesCnt
    }
    
    fun goodNodes(root: TreeNode?): Int {
        return dfs(-10000, root)
    }
}