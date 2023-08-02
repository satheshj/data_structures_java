public class LL{
    Node head;
    class Node{
        Node next;
        int data;
        Node(int d){
            data = d;
            next = null;
            }
        }
    void push(int n_data){
        Node nn = new Node(n_data);
        nn.next = head;
        head = nn;
    }
    void move(){
        Node n = head;
        Node h = head;
        Node temp = head.next;
        Node prev = n;
        while(n.next.next != null){
            n = n.next;
        }
        
        head = n.next;
        n.next = h;
        n.next.next = null;
        head.next = temp;
        
    }
    void print(){
        Node n = head;
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }
public static void main(String[] args){
    LL obj = new LL();
    obj.push(54);
    obj.push(79);
    obj.push(70);
    obj.push(78);
    System.out.println("Before swapping");
    obj.print();
    obj.move();
    System.out.println("After swapping");
    obj.print();
    }
}