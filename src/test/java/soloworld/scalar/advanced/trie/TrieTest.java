package soloworld.scalar.advanced.trie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

   private Trie trie ;


    @BeforeEach
    void setUp() {
        trie = new Trie();
    }

    @Test
    void insertTest() {
        trie.insert("solomon");
        trie.insert("soloworld");
        assertFalse(trie.search("shower"));
        assertTrue(trie.search("solomon"));
        assertEquals(2, trie.startsWith("solo"));
    }

    @Test
    void prefixTest() {
        trie.insert("apk");
        trie.insert("app");
        trie.insert("apple");
        trie.insert("arp");
        trie.insert("array");
        assertEquals(3, trie.startsWith("ap"));
        assertEquals(2, trie.startsWith("app"));
    }
    @Test
    void uniqueInsert() {
        trie.insert("10010");
        trie.insert("01010");
        trie.insert("11011");
        trie.insert("11011");
        assertEquals(3, trie.count);
    }
}