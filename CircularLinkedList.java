class CircularLinkedList{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next = null;
        Node(int d){
            data = d;
    
        }
    }
   
    void delete(){
        if(head!=tail){
            Node temp = head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            tail=temp;
            tail.next=head;
            System.out.println("Deleted node is "+temp.data);
        }
    }
    void add(int n_data){
        Node nn = new Node(n_data);
        if(head==null){
            head=nn;
            tail=nn;
            nn.next=head;
        }else{
            tail.next=nn;
            tail = nn;
            tail.next=head;
        }
    }
    void print(){
        Node temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=head);
    }
    public static void main(String args[]){
        CircularLinkedList obj = new CircularLinkedList();
        obj.add(5);
        obj.print();
        obj.add(7);
        obj.print();
        obj.add(9);
        obj.print();
        obj.delete();
        obj.print();
    }
}