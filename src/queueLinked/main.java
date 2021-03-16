package queueLinked;

public class main {
    public static void main (String[] args) {
        queueLinked<Integer> queue = new queueLinked<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(4);

        System.out.println("size:"+queue.size());
    }
}
