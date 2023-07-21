//二叉树的前序、中序、后序遍历

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class Binarytreetraversal {
    //前序遍历  根-》左-》右
    public void preorder(List<Integer> arr, TreeNode root){
        if (root==null){
            return;
        }
        arr.add(root.val);
        preorder(arr,root.left);
        preorder(arr,root.right);
    }

    //中序遍历  左-》根-》右
    public void inorder(List<Integer> arr, TreeNode root){
        if (root==null){
            return;
        }
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);
    }

    //中序遍历 左-》右-》根
    public void postorder(Deque qu,TreeNode root){
        //这里qu是利用栈来存储后序遍历的结果，pop（）出来的就是后序遍历
        if (root==null){
            return;
        }
        qu.push(root.val);
        postorder(qu,root.right);
        postorder(qu,root.left);
    }


}
