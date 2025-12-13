package DSA;

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
    public  static void main(String[]args){

        ListNodes head=new ListNodes(5);
        ListNodes first=new ListNodes(7);
        ListNodes second=new ListNodes(8);
        //linked node
        head.next=first;
        first.next=second;

        printLinkedList(head);
        head = reverseLinkedList(head);
        printLinkedList(head);


    }
}
