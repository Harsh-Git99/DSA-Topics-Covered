package ADVANCED_DSA.BinaryTrees.BFS_types;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrderTraversal {
    public static void main(String[] args) {

        NodeClass root= new NodeClass(1);

        root.left = new NodeClass(2);
        root.right = new NodeClass(3);

        root.left.left = new NodeClass(4);
        root.left.right = new NodeClass(5);

        root.right.left = new NodeClass(6);
        root.right.right = new NodeClass(7);

        System.out.println(levelOrder(root));


    }

    static List<List<Integer>> levelOrder(NodeClass node){
        Queue<NodeClass> q = new LinkedList<NodeClass>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(node == null) return wrapList;
        q.offer(node);

        while(!q.isEmpty()){
            int flag =0;
            int levelNum = q.size();
            List<Integer> sublist = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                if(flag == 1){
                    if(q.peek().left!= null) q.offer(q.peek().left);
                    if(q.peek().right!= null) q.offer(q.peek().right);
                }
                else if(flag == 0 ){
                    if(q.peek().right!= null) q.offer(q.peek().right);
                    if(q.peek().left!= null) q.offer(q.peek().left);
                }
                sublist.add(q.poll().data);
                if(flag == 0 )flag=1;
                if(flag == 1 )flag=0;

            }
            wrapList.add(sublist);
        }
        return wrapList;
    }
}
