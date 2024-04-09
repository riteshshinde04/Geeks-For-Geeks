class Solution {
    ArrayList<Integer> boundary(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        res.add(root.data);
        if (isLeaf(root)) {
            return res;
        }
        addLeftNode(root.left, res);
        addLeaves(root, res);
        addRightNode(root.right, res);
        return res;
    }

    boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) {
            addLeaves(root.left, res);
        }
        if (root.right != null) {
            addLeaves(root.right, res);
        }
    }

    void addLeftNode(Node root, ArrayList<Integer> res) {
        if (root == null || isLeaf(root)) {
            return;
        }
        res.add(root.data);
        if (root.left != null) {
            addLeftNode(root.left, res);
        } else {
            addLeftNode(root.right, res);
        }
    }

    void addRightNode(Node root, ArrayList<Integer> res) {
        if (root == null || isLeaf(root)) {
            return;
        }
        if (root.right != null) {
            addRightNode(root.right, res);
        } else {
            addRightNode(root.left, res);
        }
        res.add(root.data);
    }
}
