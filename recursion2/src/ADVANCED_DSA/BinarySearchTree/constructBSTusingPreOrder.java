package ADVANCED_DSA.BinarySearchTree;

public class constructBSTusingPreOrder {
    public static void main(String[] args) {
        int[] preorder = {5,2};

        System.out.println(bstPreOrder(preorder,0,preorder.length-1).data);

        System.out.println();
        preOrder(bstPreOrder(preorder,0,preorder.length-1));
    }

    static Node bstPreOrder(int[] arr, int st, int end){
        if(st > end || st >= arr.length ){
            return null;
        }

        Node root = new Node(arr[st]);
        int i = findNextMax(arr, st);

        root.left = bstPreOrder(arr,st+1,i-1);
        root.right = bstPreOrder(arr,i,end);

        return root;
    }

    static int findNextMax(int[] arr, int st){
        for (int i = st+1; i < arr.length; i++) {
            if(arr[i] > arr[st] ) return i;
        }
        return arr.length;
    }

    static void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
}
