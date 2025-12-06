class Sort {
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
    
    public void prtreve(){
        
    }

    
    public static void main(String[] args) {
       Main linklist = new Main();
      

        linklist.prt();
    }
}
