import java.util.Random;
public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST();
        Random random = new Random();
        for (int i = 1; i < 11; i++) {
            bst.put(random.nextInt(-25, 25), "Value " + random.nextInt(-25, 25));
        }
        System.out.println(bst.getSize());
        System.out.println(bst.getHeight());
    }
}
