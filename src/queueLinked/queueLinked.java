package queueLinked;

public class queueLinked<T> {
    private Node<T> head, tail;
    int length = 0;

    public void enqueue(T item){
        Node<T> oldTail = tail;
        tail = new Node<T>();
        tail.data = item;
        tail.next = null;
        if(isEmpty()){
            head = tail;
        }else{
            oldTail.next = tail;
        }
        length++;
    }
    public T dequeue(){
        T item = head.data;
        head = head.next;
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
