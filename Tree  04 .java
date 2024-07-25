public class Solution {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    static int search(int inorder[], int start, int end, int curr) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == curr) {
                return i;
            }
        }
        return -1;
    }

    static Node buildTree(int preorder[], int inorder[], int start, int end, int[] idx) {
        if (start > end) {
            return null;
        }
        int curr = preorder[idx[0]];
        idx[0]++;
        Node node = new Node(curr);
        if (start == end) {
            return node;
        }
        int pos = search(inorder, start, end, curr);
        node.left = buildTree(preorder, inorder, start, pos - 1, idx);
        node.right = buildTree(preorder, inorder, pos + 1, end, idx);

        return node;
    }

    static void inorderPrint(Node root) {
        if (root == null) {
            return;
        }
        inorderPrint(root.left);
        System.out.print(root.data + " ");
        inorderPrint(root.right);
    }

    public static void main(String[] args) {
        int preorder[] = {1, 2, 4, 3, 5};
        int inorder[] = {4, 2, 1, 5, 3};

        int[] idx = {0};  
        Node root = buildTree(preorder, inorder, 0, inorder.length - 1, idx);
        inorderPrint(root);
    }
}
