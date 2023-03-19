package a123.Tries;

import java.util.ArrayList;
import java.util.Map;

public class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {

        char[] chArray = word.toCharArray();
        TrieNode current = root;
        for (char ch : chArray) {
            if (!current.children.containsKey(ch)) {
                current.children.put(ch, new TrieNode());
            }
            current = current.children.get(ch);
        }
        current.isEnd = true;
    }

    public boolean search(String word) {

        TrieNode current = root;
        char[] chArray = word.toCharArray();
        for (char ch : chArray) {
            if (current.children.containsKey(ch)) {
                current = current.children.get(ch);
            } else {
                return false;
            }
        }
        return current.isEnd;
    }

    public boolean prefix(String word) {

        TrieNode current = root;
        char[] chArray = word.toCharArray();
        for (char ch : chArray) {
            if (current.children.containsKey(ch)) {
                current = current.children.get(ch);
            } else {
                return false;
            }
        }
        return true;
    }

    public int countUniqueWords(TrieNode current) {
        int count = 0;
        if (current == null) return 0;
        for (Map.Entry<Character, TrieNode> entry : current.children.entrySet()) {
            if (entry.getValue().isEnd) count++;
            count += countUniqueWords(current.children.get(entry.getKey()));
        }
        return count;
    }

    public ArrayList<String> getAllWords() {
        ArrayList<String> result = new ArrayList<>();
        getAllWords(root, "", result);

        return result;
    }

    private void getAllWords(TrieNode currentNode, String prefix, ArrayList<String> result) {
        if (currentNode.isEnd) result.add(prefix);

        for (Map.Entry<Character, TrieNode> eachEntry : currentNode.children.entrySet()) {
            char ch = eachEntry.getKey();
            TrieNode deeperNode = eachEntry.getValue();
            getAllWords(deeperNode, prefix + ch, result);
        }
    }


}
