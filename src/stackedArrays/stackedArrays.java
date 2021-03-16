package stackedArrays;

public class stackedArrays<T> {
    @SuppressWarnings("unchecked") //in case of IDE error
    private T[] N = (T[]) new Object[1]; //for array

    private int length = 0;

    public boolean isEmpty() {
        return length == 0;
    }
    public int size(){
        return length;
    }

    @SuppressWarnings("unchecked")
    private void resize(int capacity){//method that takes new capacity as an input parameter
        T[] copy = (T[]) new Object [capacity];
        for(int i = 0; i < length; i++) {
            copy[i] = N[i];
        }
        N = copy;
    }

    public void push(T item){ //pushes item onto the stack
        if(length == N.length) resize(2*N.length);
        N[length++] = item;
    }
    public T pop(){ // removes top item from the stack, and returns its data
        if (isEmpty()) throw new IndexOutOfBoundsException("Is Empty lmao");
        T item = N[length-1];
        N[length-1] = null;
        length--;
        if (length > 0 && length == N.length/4) resize(N.length/2);
        return item;
    }
}
