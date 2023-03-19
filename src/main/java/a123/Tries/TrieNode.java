package a123.Tries;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    Map<Character, TrieNode> children;
    boolean isEnd;

    public TrieNode(){
        children=new HashMap<>();
        isEnd=false;
    }

}
