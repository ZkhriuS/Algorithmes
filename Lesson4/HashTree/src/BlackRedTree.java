import java.util.ArrayList;
import java.util.List;

public class BlackRedTree {
    private ColorNode root;
    public boolean add(int value){
        if (root != null){
            boolean result = addNode(root, value);
            root = balance(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new ColorNode();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }
    private boolean addNode(ColorNode node, int value){
        if(node.value==value)
            return false;
        if(node.value > value){
            if(node.right!=null){
                boolean result = addNode(node.right, value);
                node.right = balance(node.right);
                return result;
            } else {
                node.right = new ColorNode();
                node.right.color = Color.RED;
                node.right.value = value;
                return true;
            }
        } else{
            if(node.left != null){
                boolean result = addNode(node.left, value);
                node.left = balance(node.left);
                return result;
            } else {
                node.left = new ColorNode();
                node.left.color = Color.RED;
                node.left.value = value;
                return true;
            }
        }
    }
    private ColorNode balance(ColorNode node){
        ColorNode result = node;
        boolean needBalance;
        do{
            needBalance = false;
            if(result.right != null && result.right.color == Color.RED &&
                    (result.left==null || result.left.color == Color.BLACK)){
                needBalance = true;
                result = rightSwap(result);
            }
            if(result.left != null && result.left.color == Color.RED &&
                    result.left.left != null && result.left.left.color == Color.RED){
                needBalance = true;
                result = leftSwap(result);
            }
            if(result.right != null && result.right.color == Color.RED &&
                    result.left != null && result.left.color == Color.RED){
                needBalance = true;
                colorSwap(result);
            }
        }while(needBalance);
        return result;
    }
    private ColorNode rightSwap(ColorNode node){
        ColorNode right = node.right;
        ColorNode between = right.left;
        right.left = node;
        node.right = between;
        right.color = node.color;
        node.color = Color.RED;
        return right;
    }
    private ColorNode leftSwap(ColorNode node){
        ColorNode left = node.left;
        ColorNode between = left.right;
        left.right = node;
        node.left = between;
        left.color = node.color;
        node.color = Color.RED;
        return left;
    }
    private void colorSwap(ColorNode node){
        node.left.color = Color.BLACK;
        node.right.color = Color.BLACK;
        node.color = Color.RED;
    }
    public ColorNode print(){
        List<ColorNode> currentLine = new ArrayList<>();
        currentLine.add(root);
        while(currentLine.size()>0){
            List<ColorNode> nextLine = new ArrayList<>();
            for (ColorNode node: currentLine) {
                if(node!=null) {
                    nextLine.add(node.right);
                    nextLine.add(node.left);
                    System.out.print(node.value + "\t");
                }
                else
                    System.out.print(" \t");
            }
            System.out.println();
            currentLine = nextLine;
        }
        return  null;
    }
}
