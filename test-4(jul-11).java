class Node 
{ 
    int roll_no; 
    String name; 
    Node prev,next; 
     
    public Node(int roll_no,String name) 
    { 
        this.roll_no = roll_no; 
        this.name = name; 
        this.prev = null; 
        this.next = null; 
    } 
} 
class StudentQueueNode 
{ 
    Node head; 
     
        public void insertAtEnd(int roll_no,String name) 
    { 
        Node newNode = new Node(roll_no,name); 
         
        if(head == null) 
        { 
            head = newNode; 
            return; 
        } 
        
        Node temp = head; 
        while(temp.next!=null) 
        { 
            temp = temp.next; 
        } 
        temp.next = newNode;       
        newNode.prev = temp;   
    } 
 
     
    public void insertAtFront(int roll_no,String name) 
    { 
        Node newNode = new Node(roll_no,name); 
         
        if(head == null) 
        { 
            head = newNode; 
            return; 
        } 
        newNode.next = head; 
        head.prev = newNode; 
        head = newNode; 
    } 
     
    public void insertAtPosition(int roll_no,String name,int position) 
    { 
        if(position <= 1) 
        { 
            insertAtFront(roll_no,name); 
            return; 
        } 
        Node newNode = new Node(roll_no,name); 
        Node temp = head; 
        int count = 1; 
         
        while(temp != null && count<position-1) 
        { 
            temp = temp.next; 
            count++; 
        } 
        if(temp.next == null || temp == null) 
        { 
            insertAtEnd(roll_no,name); 
            return; 
        } 
        newNode.next = temp.next; 
        newNode.prev = temp; 
        temp.next.prev = newNode; 
        temp.next = newNode; 
    } 
     
    public void deleteFromFront()  
    { 
        if (head == null) 
        { 
            System.out.println("Student Queue is empty. Nothing to be deleted from front!!!"); 
            return; 
        } 
        System.out.println("\nStudent Deleted from front -> Roll Number : " + head.roll_no + "\tName : " + head.name); 
        head = head.next; 
        if (head != null)  
        { 
            head.prev = null; 
        } 
    } 
 
    public void deleteFromEnd()  
    { 
        if (head == null)  
        { 
            System.out.println("Student Queue is empty. Nothing to deleted from end!!!"); 
            return; 
        } 
        Node temp = head; 
        while (temp.next != null)  
        { 
        temp = temp.next; 
        } 
        System.out.println("\nStudent Deleted from end -> Roll Number : " + temp.roll_no + "\tName : " + temp.name); 
        if (temp.prev != null) 
        { 
            temp.prev.next = null; 
            }  
            else  
            { 
                head = null;            } 
    } 
 
     
    public void displayBackward() 
    { 
        Node temp = head; 
        if(temp == null) 
        { 
            System.out.println("\n****Student Queue List is empty****"); 
            return; 
        } 
        while(temp.next!= null) 
        { 
            temp = temp.next; 
        } 
        System.out.println("\n****Student Queue list data in backward are****"); 
        while(temp != null) 
        { 
            System.out.println("\nStudent Roll no : "+temp.roll_no+"\tStudent Name : "+temp.name); 
            temp = temp.prev; 
        } 
         
    } 
     
    public void displayForward() 
    { 
        Node temp = head; 
        System.out.println("\n***Student Queue list data in forward are ***"); 
        while(temp != null) 
        { 
            System.out.println("\nStudent Roll Number : "+temp.roll_no+"\tStudent Name : "+temp.name); 
            temp = temp.next; 
        } 
    } 
     
} 
public class DoublyLinkedList { 
     
    public static void main(String[] args)  
    { 
        StudentQueueNode sn = new StudentQueueNode(); 
     
        sn.insertAtFront(101,"Raguraman"); 
        sn.insertAtEnd(105,"Varshana"); 
        sn.insertAtPosition(102,"Makila",2); 
        sn.insertAtPosition(103,"Rakshana",3); 
        sn.insertAtPosition(104,"Kanish",4); 
        sn.displayForward(); 
        sn.displayBackward(); 
        sn.deleteFromEnd(); 
        sn.deleteFromFront(); 
        System.out.println("\nAfter Deletion !!!"); 
        sn.displayForward(); 
        sn.displayBackward(); 
    } 
} 
 
