class Node {
    int data;
    Node next;
}
public class SingleLinkedList{
    Node head;
    void insert (int value){
        Node newNode=new Node();
        newNode.data=value;
        newNode.next=null;
        if (head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;}
               { temp.next=newNode;
            }
        }
    }
    void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null...");
    }
      public static void main(String[] args) {
          SingleLinkedList sl=new SingleLinkedList();
          sl.insert(10);
          sl.insert(20);
          sl.insert(30);
          sl.insert(40);
          System.out.println("Linked List");
          sl.display();
          
    }  
}
