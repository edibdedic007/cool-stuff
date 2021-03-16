package queueLinked;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class queueLinkedTest {

    private queueLinked<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new queueLinked<Integer>();
    }

    @AfterEach
    void tearDown() {
        queue = null;
    }

    @Test
    void testChecksEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void testCorrectlyEnqeuesToQueue() {
        queue.enqueue(1);
        queue.enqueue(2);
        assertFalse(queue.isEmpty());
        assertEquals(2, queue.size());
    }

    @Test
    void testCorrectlyDequeuesFromQueue() {
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(3, queue.dequeue());
    }

    @Test
    void testCorrectlyEnqueuesAndDequeues() {
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(8);
        assertEquals(5, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertEquals(8, queue.dequeue());
        assertEquals(0, queue.size());
    }
}