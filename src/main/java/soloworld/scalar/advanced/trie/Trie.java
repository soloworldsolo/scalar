package soloworld.scalar.advanced.trie;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.util.Objects.isNull;

public class Trie {

    TrieNode root = new TrieNode();
    int count =0;

    public void insert(String word) {
        TrieNode current = root;
        int i=0;
        boolean notPresent =false;
        for (Character character : word.toCharArray()) {
            if (current.chileNode == null || !current.chileNode.containsKey(character)) {
                if (isNull(current.chileNode)) {
                    current.setChileNode(new HashMap<>());
                    current.setCharacterCountMap(new HashMap<>());
                }
                current.chileNode.put(character, new TrieNode());
                current.characterCountMap.putIfAbsent(character ,0);
                notPresent = true;
            }
            current.characterCountMap.computeIfPresent(character , (key ,value ) -> value+1);
            current = current.chileNode.getOrDefault(character, new TrieNode());
            if(i==word.length()-1) {
                current.isEnd = true;
            }
            i++;
        }
        if(notPresent) {
            count++;
        }
    }

    public boolean search(String word) {
        TrieNode current = root;
        for(Character character: word.toCharArray()) {
            current = current.chileNode.get(character);
            if(current == null) {
                return false;
            }
        }
        return current !=null && current.isEnd;
    }

    public int startsWith(String prefix) {
       int count = 0;
        Objects.requireNonNull(prefix ,"input canot be null");
        TrieNode current = root;
       for(Character character:prefix.toCharArray()) {
           if(!current.chileNode.containsKey(character)) {
               return count =0;
           }
           count = current.characterCountMap.get(character);
            current = current.chileNode.get(character);
       }

       return count;
    }

    private static class TrieNode {

        private Map<Character, TrieNode> chileNode;
        private boolean isEnd;


        private Map<Character, Integer> characterCountMap;

        public void setChileNode(Map<Character, TrieNode> chileNode) {
            this.chileNode = chileNode;
        }

        public void setCharacterCountMap(Map<Character, Integer> characterCountMap) {
            this.characterCountMap = characterCountMap;
        }

        public TrieNode(Map<Character, TrieNode> chileNode, boolean isEnd) {
            this.chileNode = chileNode;
            this.isEnd = isEnd;
        }

        public TrieNode() {
        }

    }
}
