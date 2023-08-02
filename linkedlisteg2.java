class LL1{
Node head;
class Node{
int data;
Node next;
Node(int d){
data=d;
next=null;
}
}
void push(int n_data){
Node nn = new Node(n_data);
if(head==null){
head = nn;
}else{
nn.next=head;
head=nn;
}
}
void delete(int pos){
    Node temp = head;
    if(pos==1){
        head=head.next;
        System.out.println(temp.data);
    }
    Node prev = null;
    while(--pos>0){
        prev=temp;
        temp=temp.next;
    }
    prev.next=temp.next;
    System.out.println("Deleted node is"+temp.data);
}
void insertAfter(Node prev,int n_data){
    Node nn = new Node(n_data);
    Node temp = head;
    while(temp.data!=prev.data){
        temp=temp.next;
    }
    nn.next=temp.next;
    temp.next=nn;
}
void insertLast(int n_data){
    Node nn = new Node(n_data);
    Node temp = head;
    
    while(temp.next!=null){
        
        temp=temp.next;
    }
    temp.next=nn;
}
void print(){
    Node n = head;
    int max = 0;
    int sum = 0;
while(n!=null){
    if(max<n.data){
        max = n.data;
    }
System.out.println(n.data);
sum += n.data;
n=n.next;

}
System.out.println("Maximum value"+max);
System.out.println(sum);
}
public static void main(String args[]){
LL1 obj = new LL1();
obj.push(5);

obj.push(12);

obj.push(34);
obj.insertAfter(obj.head.next, 10);
obj.print();
obj.insertLast(67);
obj.print();
obj.delete(3);
obj.print();
obj.delete(4);
obj.print();
}
}