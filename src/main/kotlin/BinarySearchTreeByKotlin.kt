class BinarySearchTreeByKotlin {
    var sum = 0
    fun bstToGst(root: TreeNode?): TreeNode? {
        if (root?.right != null) {
            bstToGst(root.right)
        }

        root!!.`val` += sum;
        sum = root!!.`val`

        if (root?.left != null) {
            bstToGst(root.left)
        }

        return root;
    }

}

class TreeNode2(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}