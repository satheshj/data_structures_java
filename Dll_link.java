class Dll_link{
    Node head;
    class Node{
        int data;
        Node prev=null,next=null;
        Node(int d){
            data = d;
        }
    }
    public void add(int n_data){
        Node nn = new Node(n_data);
        if(head == null){
            head = nn;
        }else{
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void delete_tailnode(){
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next; 
        }
        prev.next=null;
        System.out.println("Deleted node is"+temp.data);
    }
    void delete_middlenode(int data){
        Node temp = head;
        Node prev = null;
        while(temp.data != data){
            prev = temp;
            temp = temp.next;
        }
        prev.next=temp.next;
        
        System.out.println("Deleted node is"+temp.data);
    }
    public static void main(String args[]){
        Dll_link obj = new Dll_link();
        obj.add(6);
        obj.add(3);
        obj.add(9);
        obj.print();
        obj.delete_middlenode(3);
        obj.print();
    }
}