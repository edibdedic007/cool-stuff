package stackedArrays;

public class stackedArrays<T> {
    @SuppressWarnings("unchecked")
    private T[] N = (T[]) new Object[1];

    private int length = 0;

    public boolean isEmpty() {
        return length == 0;
    }
    public int size(){
        return length;
    }

    @SuppressWarnings("unchecked")
    private void resize(int capacity){
        T[] copy = (T[]) new Object [capacity];
        for (int i = 0; i < length; i++) {
            copy[i] = N[i];
        }
        N = copy;
    }

    public void push(T item){
        if(length == N.length) resize(2*N.length);
        N[length++] = item;
    }
    public T pop(){
        if (isEmpty()) throw new IndexOutOfBoundsException("Is Empty lmao");
        T item = N[length-1];
        N[length-1] = null;
        length--;
        if (length > 0 && length == N.length/4) resize(N.length/2);
        return item;
    }
}
