package _814_binary_tree_pruning

import jdk.nashorn.internal.ir.BinaryNode
import java.util.Stack



/**
 * Created by eth4 on 08/04/18.
 */

class BinaryTreePruning {
    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun pruneTree(root: TreeNode?): TreeNode? {
        return dfs(root)
    }


    fun dfs(cur: TreeNode?): TreeNode? {
        if (cur == null)
            return null
        if (cur.left != null) {
            cur.left = dfs(cur.left)
        }
        if (cur.right != null) {
            cur.right = dfs(cur.right)
        }
        if (cur.left == null && cur.right == null && cur.`val` != 1)
            return null
        return cur
    }

}

