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
    fun maxLevelSum(root: TreeNode?): Int {
        val queue = LinkedList<TreeNode>().apply{ add(root!!) }
        var maximal = root!!.`val`
        var maxLevel = 1
        var curLevel = 1
        
        while(queue.isNotEmpty()) {
            var sumOfLevel: Int? = null
            curLevel+=1
            
            repeat(queue.size) {
                val treeNode = queue.poll()
                
                treeNode.left?.let{
                    sumOfLevel = (sumOfLevel?:0) +  it.`val`
                    queue.add(it)
                }
                
                treeNode.right?.let{
                    sumOfLevel = (sumOfLevel?:0) + it.`val`
                    queue.add(it)
                }
            }
            
            if(sumOfLevel!= null && maximal < sumOfLevel!!) {
                maxLevel = curLevel
                maximal = sumOfLevel!!
            }
        }
        return maxLevel
    }
}