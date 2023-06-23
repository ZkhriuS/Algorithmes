public class List {
    public Node head;
    public Node tail;

    //поиск элемента по значению в списке
    public Node find(int value){
        Node currentNode = head;
        while(currentNode!=null){
            if(currentNode.value==value)
                return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    //вставка элемента на позицию в списке
    public void add(int value){
        Node node = new Node();
        node.value = value;
        if(head==null){
            head = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
    }

    public void add(int value, Node node){
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.prev = node;
        if(next==null){
            tail = newNode;
        } else {
            next.prev = newNode;
            newNode.next = next;
        }
    }

    //удаление элемента из списка
    public void delete(Node node){
        Node previous = node.prev;
        Node next = node.next;
        if(previous==null){
            next.prev = next;
            head = next;
        }
        else if(next==null){
            previous.next = null;
            tail = previous;
        }
        else {
            previous.next = next;
            next.prev = previous;
        }
    }

    //разворот списка
    public void revertBinary(){
        Node currentNode = head;
        while(currentNode!=null){
            Node next = currentNode.next;
            Node previous = currentNode.prev;
            currentNode.next = previous;
            currentNode.prev = next;
            if(previous==null)
                tail = currentNode;
            if(next == null)
                head = currentNode;
            currentNode = next;
        }
    }

    public void revert(){
        if(head!=null && head.next!=null){
            revert(head.next, head);
        }
    }
    public void revert(Node currentNode, Node prevNode){
        if(currentNode.next==null)
            head = currentNode;
        else{
            revert(currentNode.next, currentNode);
        }
        currentNode.next = prevNode;
        prevNode.next = null;
    }
    public void print(){
        Node current = head;
        while(current!=null){
            System.out.print(current.value+" ");
            current = current.next;
        }
        System.out.println();
    }
}
