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
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leftStack:Stack<TreeNode> = Stack()
        val rightStack:Stack<TreeNode> = Stack()
        
        leftStack.push(root1)
        rightStack.push(root2)
        
        /*
        만약 leftSequence가 3,4,5,6 이고, rifhtSequence가 3,4,5 일때 while문의 조건이 ||가 되면
        rifhtStack.isNotEmpty() 조건이 먼저 끝나서 while문을 나오게되고 true를 리턴하게 된다,
        그러나 &&가 된다면 rightVal은 -1, leftVal은 6이 되어 false를 리턴하게 된다.
        */
        while(leftStack.isNotEmpty() || rightStack.isNotEmpty()) {
            var leftVal = -1
            var rightVal = -1 
            
            while(leftStack.isNotEmpty()) {
                val node = leftStack.pop()
                if(node.left==null && node.right==null) {
                    leftVal = node.`val`
                    println("leftTree's leaf is $leftVal")
                    break
                } else {
                    println("leftTree's branch is ${node.`val`}")
                    node.right?.let{ leftStack.push(it) }
                    node.left?.let{ leftStack.push(it) }
                    
                }
            }
            
            while(rightStack.isNotEmpty()) {
                val node = rightStack.pop()
                if(node.left==null && node.right==null) {
                    rightVal = node.`val`
                    println("rightTree's leaf is $rightVal")
                    break
                } else {
                    println("rightTree's branch is ${node.`val`}")
                    node.right?.let{ rightStack.push(it) }
                    node.left?.let{ rightStack.push(it) }
                    
                }
            }
            
            if(leftVal != rightVal) return false
        }
        
        return true
    }
}