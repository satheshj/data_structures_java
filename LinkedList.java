class LinkedList{
Node head;
static class Node{
int data;
Node next;
Node(int d){
data = d;
next = null;
}
}
void print(){
Node n = head;
int count = 0;
while (n!=null){
System.out.println(n.data);
n=n.next;
count++;
}
System.out.println(count);
}
public static void main(String args[]){
LinkedList obj = new LinkedList();
obj.head = new Node(5);
Node obj2 = new Node(12);
Node obj3 = new Node(7);
obj.head.next=obj2;
obj2.next=obj3;
obj.print();

}
}