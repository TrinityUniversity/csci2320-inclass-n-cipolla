package csci2320.collections;

public class AVTMap<K extends Comparable<K>, V> {
    private static class Node<K extends Comparable<K>, V> {
        K key;
        V value;
        int height;
        Node<K,V> left, right, parent;

        //This needs a constructor, we're just not writing it in class
    }

    private Node<K,V> root;

    public boolean isConsistent() {
        return isConsistent(root);
    }
    
    private boolean isConsistent(Node<K,V> n) {
        if(n == null) return true;
        boolean ret = true;
        if(n.left != null && n.left.parent != n) {          //use of == or != because I want an identity check, not a contents check
            System.out.println("Not parent of left child. " + n.key);
            ret = false;
        }
        if(n.right != null && n.right.parent != n) {
            System.out.println("Not parent of right child. " + n.key);
            ret = false;
        }
        if(n.left != null && n.left.key.compareTo(n.key) >= 0) {
            System.out.println("Left child too big. " + n.key + " " + n.left.key);
        }
        if(n.right != null && n.right.key.compareTo(n.key) >= 0) {
            System.out.println("right child too big. " + n.key + " " + n.right.key);
        }
        //check height is consistent (for AVL)
        //check childrens heights within one (for AVL)


        boolean left = isConsistent(n.left);
        boolean right = isConsistent(n.right);
        return ret && left && right;
    }
}
