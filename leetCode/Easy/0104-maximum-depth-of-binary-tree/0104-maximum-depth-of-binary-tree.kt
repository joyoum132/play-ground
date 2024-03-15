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
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
        
        var maxDepth = 0
        val stack: Stack<Pair<TreeNode, Int>> = Stack()
        stack.push(root!! to 1)
        
        while(stack.isNotEmpty()) {
            val pair = stack.pop()
            val isLeaf = pair.first.left == null && pair.first.right == null
            
            if(isLeaf) {
                maxDepth = Math.max(maxDepth, pair.second)
            } else {
                if(pair.first.left != null) {
                    stack.push(pair.first.left!! to pair.second+1)
                }
                
                if(pair.first.right != null) {
                    stack.push(pair.first.right!! to pair.second+1)
                }
            }
        }
        
        return maxDepth
    }
}