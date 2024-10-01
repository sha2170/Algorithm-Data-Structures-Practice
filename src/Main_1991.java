import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main_1991 {
    static Map<Character, Node> tree = new HashMap<>();

    static class Node {
        char value;
        Node left, right;

        Node(char value) {
            this.value = value;
        }
    }

    // Preorder
    public static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder
    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value);
        inorder(node.right);
    }

    // postorder
    public static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value);
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < N; i++) {
                String line = sc.nextLine();
                char root = line.charAt(0);
                char left = line.charAt(2);
                char right = line.charAt(4);

                tree.putIfAbsent(root, new Node(root));
                Node node = tree.get(root);

                if (left != '.') {
                    node.left = new Node(left);
                    tree.put(left, node.left);
                }

                if (right != '.') {
                    node.right = new Node(right);
                    tree.put(right, node.right);
                }
            }

            Node root = tree.get('A'); // 항상 A가 루트

            preorder(root);
            System.out.println();

            inorder(root);
            System.out.println();

            postorder(root);
            System.out.println();

            sc.close();
        }
    }

