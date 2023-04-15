package out.SelfStudy.one_compiler.tree;

class TreeNode {
    TreeNode parent;
    TreeNode left;
    TreeNode right;
    int value;


    public TreeNode(int value) {
        this.value = value;
    }
    
    public TreeNode withLeaves(int leftVal, int rightVal) {
        left = new TreeNode(leftVal);
        right = new TreeNode(rightVal);
        return this;
    }

    public TreeNode withParent(TreeNode parent) {
        this.parent = parent;
        return this;
    }
  
    public TreeNode withLeaves(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        return this;
    }

    void insert(TreeNode root,int value){
        TreeNode newNode = new TreeNode(value);
        if (root == null){
            root = newNode;
            return;
        }

        TreeNode current = root;
        while (true){
            if (value <= current.value){
                if (current.left == null){
                    // if left is null insert there!!!
                    current.left = newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current = current.left;
            }
            else {
                if (current.right == null){
                    // if right is null insert there!!!
                    current.right = newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current = current.right;
            }
        }
    }
}