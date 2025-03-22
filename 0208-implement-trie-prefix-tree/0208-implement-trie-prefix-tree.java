import java.util.HashMap;

class Node {
    public char data;
    public boolean terminal;
    public HashMap<Character, Node> children;

    public Node(char data) {
        this.data = data;
        this.terminal = false;
        this.children = new HashMap<>();
    }

    public void makeTerminal() {
        this.terminal = true;
    }

    public boolean isTerminal() {
        return this.terminal;
    }
}

class Trie {
    private Node root;

    public Trie() {
        root = new Node('\0'); // Root node with null character
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children.containsKey(ch)) {
                curr = curr.children.get(ch);
            } else {
                Node child = new Node(ch);
                curr.children.put(ch, child);
                curr = child;
            }
        }
        curr.makeTerminal();
    }

    public boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.children.containsKey(ch)) {
                curr = curr.children.get(ch);
            } else {
                return false;
            }
        }
        return curr.isTerminal();
    }

    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (curr.children.containsKey(ch)) {
                curr = curr.children.get(ch);
            } else {
                return false;
            }
        }
        return true;
    }
}

/**
 * Usage:
 * Trie trie = new Trie();
 * trie.insert("apple");
 * boolean isFound = trie.search("apple");   // returns true
 * boolean startsWithA = trie.startsWith("app"); // returns true
 */
