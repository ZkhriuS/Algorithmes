public class Stack {
    public Node head;
    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }
    public Integer pop(){
        Integer result = null;
        if(head!=null){
            result = head.value;
            head = head.next;
        }
        return result;
    }
    public void print(){
        Node current = head;
        while(current!=null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
