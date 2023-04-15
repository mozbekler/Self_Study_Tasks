package out.SelfStudy.one_compiler.tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String commaSeparatedInput = input.next();
        TreeNode root = arrayToTree(commaSeparatedInput.split(","));
        TreeNode greatestNode = greatestNode(root);
        System.out.println(greatestNode.value);
    }

    public static TreeNode arrayToTree(String[] array) {
        TreeNode treeNode = new TreeNode(Integer.parseInt(array[0]));
        for (int i = 1; i < array.length; i++) {
            treeNode.insert(treeNode, Integer.parseInt(array[i]));

        }
        return treeNode;
    }

    public static TreeNode greatestNode(TreeNode root) {
        if (root.right == null) return root;
        return greatestNode(root.right);

    }
}