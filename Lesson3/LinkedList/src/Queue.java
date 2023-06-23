public class Queue {
    public Node head;
    public Node tail;
    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.prev = node;
        head = node;
    }
    public Integer peek(){
        Integer result=null;
        if(tail!=null){
            result = tail.value;
            tail.prev.next = null;
            tail = tail.prev;
        }
        return result;
    }
}
