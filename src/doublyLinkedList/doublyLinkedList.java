package doublyLinkedList;

import java.util.Iterator;

public class doublyLinkedList<T> implements Iterable<T> {
    Node<T> head; //points to first node
    Node<T> tail; //points to last node
    int size = 0;

    public void addToFront(T item){
        //allocate node and put in data
        Node<T> newNode = new Node<T>();
        newNode.data = item;
        //make next node head and prev null
        newNode.next = head;
        newNode.prev = null;
        //change prev of head to a new node
        if (head != null){
            head.prev = newNode;
        }
        //move head to point to new node
        head = newNode;
        size++;
    }
    public void addToRear(T item){
        //allocate node and put in data
        Node<T> newNode = new Node<T>();
        newNode.data = item;
        Node<T> tail = head; //used in line #32
        newNode.next = null; //this node is going to be last node, so node after is null
        //if list is empty then new node is head
        if (head == null){
            newNode.prev = null;
            head = newNode;
        }else{ //else travers to last node
            while (tail.next != null){
                tail = tail.next;
            }
            tail.next = newNode;//and change next of last node
            newNode.prev = tail;//last node is now prev of new node
        }
        size++;
    }
    public void removeFromFront(){
        //if list empty say empty lmao
        if (head == null){
            throw new IndexOutOfBoundsException("Empty lmao");
        }
        head = head.next; // set next node as head, garbage collector will delete the last node
        size--;
    }
    public void removeFromRear(){

        //if list empty say empty lmao
        if (head == null){
            throw new IndexOutOfBoundsException("Empty lmao");
        }else {
            Node<T> current;
            current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }
    public int count(){
        return size;
    }

    private class doublyLinkedListIterator implements Iterator<T>{
        Node<T> current = head;
        public boolean hasNext(){
            return current != null;
        }
        public T next(){
            T item = current.data;
            current = current.next;
            return item;
        }
    }
    public Iterator<T> iterator(){
        return new doublyLinkedListIterator();
    }
}
