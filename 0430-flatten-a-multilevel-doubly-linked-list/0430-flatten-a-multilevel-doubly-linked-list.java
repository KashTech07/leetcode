/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
//         Node tail = head ; 
//         Node curr = head ;
//         Stack<Node> st = new Stack<>() ;
//         while(curr!=null){
//            if(curr.child!=null){
//             if(curr.next!=null) st.push(curr.next) ;

//             curr.next = curr.child ;
//             curr.child.prev = curr ;
//             curr.child = null ;
//            }
//         if(curr.next==null && !st.isEmpty()){
//             Node temp = st.pop() ;
//             curr.next = temp ; 
//             temp.prev = curr ;
//         }
//         tail = curr ; 
//         curr = curr.next ;
//            }
//            return head ;
//         }
    
// }
 Node curr = head ; 
        while(curr!=null){
            if(curr.child!=null){
                Node temp = curr.next ;
                curr.next = curr.child ;
                curr.child.prev = curr ;
                curr.child = null ;
            
                Node tail = curr.next ;
                while(tail.next!=null) tail = tail.next ;
                tail.next = temp ;
                if(temp!=null) temp.prev = tail ;
               }
            curr =curr.next ;
        }
        return head ; 
    }

}