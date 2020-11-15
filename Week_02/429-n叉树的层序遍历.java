import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentMap;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
解题思路：使用队列先进先出方式，先将根节点添加到队列中，读取队列长度，对出节点值，并将子节点加到队列中，该层读取结束添加到返回链表中；
        每次读取的队列长度就是每一层节点的个数。
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> data = new ArrayList<>();
        if(root ==null){
            return data;
        }
       
        Queue<Node> queue = new ConcurrentLinkedDeque<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();          
            int length = queue.size();
            for(int i=0;i<length;i++){
                Node temNode = queue.poll();
                list.add(temNode.val);                   
                queue.addAll(temNode.children);
            }
            data.add(list);          
        }
         
    return data;      
    }
}
// @lc code=end