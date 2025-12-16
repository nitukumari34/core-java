package DSA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class ListNodes{
    int value;
    ListNodes next;

    ListNodes(int value){
        this.value=value;
        next=null;
    }

}
public class Main {

    public static void printLinkedList(ListNodes head){
        ListNodes temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public static ListNodes reverseLinkedList(ListNodes head){
       ListNodes curr=head;
       ListNodes temp=head;
       ListNodes prev=null;

       while(temp!=null){
           //step 1->save the address of next node
           curr=temp.next;
//           step-2 break the link
           temp.next=prev;
           prev=temp; //move the pointer
           temp=curr;
       }
        head=prev;
       return  head;

    }
    public  static ListNodes insertAtHead(ListNodes head, int X) {

        // Step 1: create new node
        ListNodes newNode = new ListNodes(X);

        // Step 2: point new node to current head
        newNode.next = head;

        // Step 3: new node becomes head
        return newNode;
    }

    public static void deleteNode(ListNodes node) {
        node.value=node.next.value;
        // skip the next node
        node.next=node.next.next;

    }
    public  static  int lengthOfLL(ListNodes head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;

        }
        return  count;
    }
    public  static boolean searchInLinkedList(ListNodes node,int x){
        while(node!=null){
            if(node.value==x)
                return true;
            node=node.next;
        }
        return  false;
    }
    public  static  ListNodes middleNode(ListNodes head){
        //optimal approach two pointer(slow,fast,tortoise method)
        ListNodes slow=head;
        ListNodes fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return  slow;
    }

//    public static ListNodes reverseList(ListNodes head) {
//    //brute force
//        // edge case
//        if (head == null || head.next == null)
//            return head;
//
//        Stack<ListNodes> stack = new Stack<>();
//
//        // Step 1: push all nodes into stack
//        ListNodes temp = head;
//        while (temp != null) {
//            stack.push(temp);
//            temp = temp.next;
//        }
//
//        // Step 2: pop to create reversed list
//        head = stack.pop();
//        temp = head;
//
//        while (!stack.isEmpty()) {
//            temp.next = stack.pop();
//            temp = temp.next;
//        }
//
//        // Step 3: last node should point to null
//        temp.next = null;
//
//        return head;
//    }

    public static ListNodes reverseList(ListNodes head) {
        //optimal
        ListNodes temp=head;
        ListNodes prev=null;
          while(temp!=null){
              ListNodes newNode=temp.next;
              temp.next=prev;
              prev=temp;
              temp=newNode;

          }
          return  prev;
    }

    public  static  boolean detectloop(ListNodes node){
        if (node == null) return false;

        ListNodes slow=node;
        ListNodes fast=node;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)return  true;
        }
        return  false;
    }

    public  static ListNodes detectCycle(ListNodes head){
        //using hashmap first put with marked visited and then traverse if present return that node
//         Map<ListNodes,Integer>mpp=new HashMap<>();
//         while(head!=null){
//             if(mpp.containsKey(head)){
//                return head;
//             }
//             mpp.put(head,1);
//             head=head.next;
//         }
//         return null;

//        using slow, fast pointer

        ListNodes slow=head;
        ListNodes fast=head;

        while (head!=null &&head.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast)break;

        }
        slow=head;
        while (slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return  slow;

    }
    public  static void main(String[]args){

        ListNodes head=new ListNodes(5);
        ListNodes first=new ListNodes(7);
        ListNodes second=new ListNodes(8);

        //linked node
        head.next=first;
        first.next=second;

//        second.next = head;


//        printLinkedList(head);
//        head = reverseLinkedList(head);
//        printLinkedList(head);

        head =insertAtHead(head,9);
        printLinkedList(head);

//        deleteNode(first);

//        printLinkedList(head);
//       int count=lengthOfLL(head);
//        System.out.println(count);
//        boolean present=searchInLinkedList(head,10);
//        System.out.println(present);

        //MiddleNode
//        head=middleNode(head);
//        printLinkedList(head);
      //reverse linkedlist
        head=reverseList(head);
        printLinkedList(head);
        boolean hasLoop = detectloop(head);
        System.out.println("Loop present: " + hasLoop);



    }
}
