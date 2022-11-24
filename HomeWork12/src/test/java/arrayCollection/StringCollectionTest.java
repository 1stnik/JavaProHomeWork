package arrayCollection;

import org.junit.jupiter.api.Assertions;


class StringCollectionTest {

    @org.junit.jupiter.api.Test
    void add() {
        StringCollection testColl = new StringCollection();
        Assertions.assertFalse(testColl.add(null));
        Assertions.assertTrue(testColl.add("A"));
        Assertions.assertEquals(1, testColl.size());
        Assertions.assertEquals("A", testColl.get(0));
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        StringCollection testColl = new StringCollection();
        Assertions.assertFalse(testColl.add(-1, "A"));
        Assertions.assertFalse(testColl.add(10, "A"));
        Assertions.assertTrue(testColl.add(0,"A"));
        Assertions.assertEquals(1, testColl.size());
        Assertions.assertEquals("A", testColl.get(0));
    }

    @org.junit.jupiter.api.Test
    void delete() {
        StringCollection testColl = new StringCollection();
        testColl.add("A");
        testColl.add("B");
        Assertions.assertTrue(testColl.delete("A"));
        Assertions.assertEquals(1, testColl.size());
        Assertions.assertFalse(testColl.delete("C"));
    }

    @org.junit.jupiter.api.Test
    void get() {
        StringCollection testColl = new StringCollection();
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        Assertions.assertEquals("B", testColl.get(1));
        Assertions.assertNull(testColl.get(-1));
        Assertions.assertNull(testColl.get(10));
    }

    @org.junit.jupiter.api.Test
    void contain() {
        StringCollection testColl = new StringCollection();
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        Assertions.assertTrue(testColl.contain("B"));
        Assertions.assertFalse(testColl.contain("D"));

    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        StringCollection testCollA = new StringCollection();
        testCollA.add("A");
        testCollA.add("B");
        testCollA.add("C");
        StringCollection testCollB = new StringCollection();
        testCollB.add("A");
        testCollB.add("B");
        testCollB.add("C");
        Assertions.assertTrue(testCollA.equals(testCollB));
        testCollB.add("D");
        Assertions.assertFalse(testCollA.equals(testCollB));
    }

    @org.junit.jupiter.api.Test
    void clear() {
        StringCollection testColl = new StringCollection();
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        Assertions.assertEquals(3, testColl.size());
        Assertions.assertTrue(testColl.clear());
        Assertions.assertEquals(0, testColl.size());
    }

    @org.junit.jupiter.api.Test
    void size() {
        StringCollection testColl = new StringCollection();
        Assertions.assertEquals(0, testColl.size());
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        Assertions.assertEquals(3, testColl.size());
        testColl.delete("A");
        Assertions.assertEquals(2, testColl.size());
    }
}