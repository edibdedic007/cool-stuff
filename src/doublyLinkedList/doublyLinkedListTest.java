package doublyLinkedList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class doublyLinkedListTest {

    private doublyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new doublyLinkedList<Integer>();
    }

    @AfterEach
    void tearDown() {
        list = null;
    }

    @Test
    void testCorrectlyAddToFront(){
        list.addToFront(1);
        list.addToFront(2);
        list.addToFront(3);
        assertEquals(3, list.size);
    }

    @Test
    void testCorrectlyAddToRear(){
        list.addToRear(1);
        list.addToRear(2);
        list.addToRear(3);
        assertEquals(3, list.size);
    }
    @Test
    void testCorrectlyRemoveFromFront(){
        list.addToRear(1);
        list.addToRear(2);
        list.addToRear(3);
        list.removeFromFront();
        list.removeFromFront();
        list.removeFromFront();
        assertEquals(0, list.size);
    }
    @Test
    void testCorrectlyRemoveFromRear(){
        list.addToRear(1);
        list.addToRear(2);
        list.addToRear(3);
        list.removeFromRear();
        list.removeFromRear();
        list.removeFromRear();
        assertEquals(0, list.size);
    }

}