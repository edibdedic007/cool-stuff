package Two_Chainz;

public class Stack<T> {
    private Node<T> top = null;
    private int length = 0;

    public void push(T item){
        Node<T> newNode = new Node<T>();
        newNode.data = item;
        newNode.next = top;
        top = newNode;
        length++;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public T pop(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Is Empty lmao");
        }
        T item = top.data;
        top = top.next;
        length--;
        return item;
    }
    public int size() {
        return length;
    }
}
