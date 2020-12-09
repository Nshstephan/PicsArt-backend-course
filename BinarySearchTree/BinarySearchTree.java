import java.util.*;
class BinarySearchTree
{
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }


    Node root;


    BinarySearchTree()
    {
        root = null;
    }

    public void dfs(Node root)
    {
        if(root==null)
            return;
        System.out.println(root.key);
        dfs(root.left);
        dfs(root.right);
    }

    public void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.poll();
            System.out.println(temp.key);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }

    }

    void insert(int key) {
        root = insertRec(root, key);
    }


    Node insertRec(Node root, int key) {

        if (root == null)
        {
            root = new Node(key);
            return root;
        }


        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);


        return root;
    }


    void inorder()
    {
        inorderRec(root);
    }


    void inorderRec(Node root) {
        if (root != null)
        {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }



    void delete(int key)
    {
        root = deleteRec(root, key);
    }
    Node deleteRec(Node root, int key)
    {

        if (root == null)
            return root;


        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else
            {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = min(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }


    int min(Node root)
    {
        int temp = root.key;
        while (root.left != null)
        {
            temp = root.left.key;
            root = root.left;
        }
        return temp;
    }
}