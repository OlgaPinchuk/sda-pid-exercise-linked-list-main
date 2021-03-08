package se.sdaproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        String expected = "LinkedList(5)";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void testSearchNumberInList() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(9);
        list.add(1);
        int index = list.search(9);
        int expected = 1;
        assertEquals(index, expected);
    }

    @Test
    void testSearchAbsentNumberInList() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(9);
        list.add(1);
        int index = list.search(8);
        int expected = -1;
        assertEquals(index, expected);
    }

    @Test
    void testSearchInEmptyList() {
        LinkedList list = new LinkedList();
        int index = list.search(8);
        int expected = -1;
        assertEquals(index, expected);
    }

    @Test
    void testGetNodeByIndex() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(9);
        list.add(1);
        int index = list.get(1);
        int expected = 9;
        assertEquals(index, expected);
    }
    @Test
    void testGetNodeByIndexOutOfRange() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(9);
        list.add(1);
        int index = list.get(3);
        int expected = -1;
        assertEquals(index, expected);
    }
    @Test
    void testGetNodeByIndexInEmptyList() {
        LinkedList list = new LinkedList();
        int index = list.get(3);
        int expected = -1;
        assertEquals(index, expected);
    }
    @Test
    void testListSize() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(9);
        list.add(1);
        int index = list.size();
        int expected = 3;
        assertEquals(index, expected);
    }
    @Test
    void testEmptyListSize() {
        LinkedList list = new LinkedList();
        int index = list.size();
        int expected = 0;
        assertEquals(index, expected);
    }
}
