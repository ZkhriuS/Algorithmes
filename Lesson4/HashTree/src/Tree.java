import java.util.ArrayList;
import java.util.List;

public class Tree {
    private  Node root;
//    private Node find(int value, Node current){
//        if(current.value==value)
//            return current;
//        for (Node node: current.children) {
//            Node result = find(value, node);
//            if(result!=null)
//                return result;
//        }
//        return null;
//    }
    public Integer exist(int value){
        if(root == null)
            return null;
        //Node result = find(value, root);
        Node result = find(value);
        if(result==null)
            return null;
        return result.value;
    }
    public Node find(int value){
        List<Node> currentLine = new ArrayList<>();
        currentLine.add(root);
        while(currentLine.size()>0){
            List<Node> nextLine = new ArrayList<>();
            for (Node node: currentLine) {
                if(node.value == value){
                    return node;
                }
                nextLine.addAll(node.children);
            }
            currentLine = nextLine;
        }
        return  null;
    }
}
