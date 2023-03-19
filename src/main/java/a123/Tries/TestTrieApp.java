package a123.Tries;

import com.github.javafaker.Faker;

import java.util.ArrayList;

public class TestTrieApp {
    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("dog");
//        trie.insert("d");
//        trie.insert("abba");
//        trie.insert("doggy");

//        }
//        System.out.println("animals count "+animals.size());
//        System.out.println("unique animals "+ animals.stream().distinct().count());
//        for (String animal : animals) {
//            trie.insert(animal);
//        }

//        System.out.println(trie.search("do"));
//        System.out.println(trie.search("dog"));
//        System.out.println(trie.search("doggy"));

//        System.out.println("prfix do " + trie.prefix("do"));

        System.out.println("count " + trie.countUniqueWords(trie.root));
        System.out.println(trie.getAllWords());
        System.out.println(trie.getAllWords().size());

    }
}
