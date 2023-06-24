public class Main {
    public static void main(String[] args) {
        int size = 16;
        BlackRedTree tree = new BlackRedTree();
        for(int i = 0; i<size; i++){
            int value = (int)(Math.random()*100);
            tree.add(value);
        }
        tree.print();
    }
}