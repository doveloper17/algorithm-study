import java.util.*;

public class BinarySearchTree {
    public TreeNode bstToGst(TreeNode root) {
        Queue<TreeNode> queueForTreeNode = new LinkedList<>();
        queueForTreeNode = getQueueForTreeNode(queueForTreeNode, root);

        int sum = 0;
        for (TreeNode node : queueForTreeNode) {
            node.val = sum + node.val;
            sum = node.val;
        }

        return root;
    }

    private Queue<TreeNode> getQueueForTreeNode(Queue<TreeNode> queue, TreeNode node) {
        if (hasRight(node)) {
            queue = getQueueForTreeNode(queue, node.right);
        }

        queue.add(node);

        if (hasLeft(node)) {
            queue = getQueueForTreeNode(queue, node.left);
        }

        return queue;
    }

    private boolean hasLeft(TreeNode root) {
        return !Objects.isNull(root.left);
    }

    private boolean hasRight(TreeNode root) {
        return !Objects.isNull(root.right);
    }
}
