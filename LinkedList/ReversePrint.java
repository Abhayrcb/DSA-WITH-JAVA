class ReversePrint {
    // nested class for node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    // head of linked list
    Node head=null;
    

    // add data at first of linked list
    public void addatfirt(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        return;
    }
    
    // add data at last of linked list
    public void addatlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newnode;
        return;
    }
    

    public void sort(){
        if(head==null || head.next==null){
            return;
        }
       
    }
   


    // print linked list in forward direction
    public void prt(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    

    // print linked list in reverse direction with the help of recursion
    public static void prtreve(Node current){
        if(current.next!=null){
            prtreve(current.next);
        }
        System.err.println(current.data);
        return;
    }

    
    public static void main(String[] args) {
       ReversePrint linklist = new ReversePrint();
         linklist.addatfirt(5);
         linklist.addatfirt(4);
         linklist.addatfirt(3);
         linklist.addatfirt(2);
         linklist.addatfirt(1);



        linklist.prt();
        System.out.println("Printing in reverse order:");
        prtreve(linklist.head);
    }
}
