class Main {
    // nested class for node
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data= data;
            this.next=null;
        }
    }
    // head of linked list
    Node head=null;
    

    // add data at first of linked list
    public void addatfirst(String data){
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
    public void addatlast(String data){
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
    
    public void prt(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    
    public static void main(String[] args) {
       Main linklist = new Main();
       linklist.addatfirst("abhay");
       linklist.addatfirst("abha");
       linklist.addatfirst("abh");
       linklist.addatfirst("ab");
       linklist.addatfirst("a");
       
       linklist.addatlast("a");
       linklist.addatlast("ab");
       linklist.addatlast("abh");
       linklist.addatlast("abha");
        linklist.addatlast("abhay");
        
        linklist.prt();
    }
}