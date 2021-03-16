package queueLinked;

public class queueLinked<T> {
    private Node<T> head, tail;
    int length = 0;

    public void enqueue(T item){
        //Allocate space for new node.
        Node<T> oldTail = tail;
        tail = new Node<T>();
        tail.data = item;
        tail.next = null;
        //check if empty. True: initialize both head and tail
        if(isEmpty()){
            head = tail;
        }else{//update tail
            oldTail.next = tail;
        }
        length++;
    }
    public T dequeue(){
        //advance head to next node
        T item = head.data;
        head = head.next;
        //if the list becomes empty
        if (isEmpty()){
            tail = null;
        }
        length--;
        return item;
    }

    public boolean isEmpty() {
        return length == 0;
    }
    public int size(){
        return length;
    }
}
