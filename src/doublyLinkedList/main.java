package doublyLinkedList;

public class main {
    public static void main(String[] args){
        doublyLinkedList<Integer> list = new doublyLinkedList<Integer>();

        list.addToRear(1);
        list.addToRear(2);
        list.addToRear(3);
        list.addToRear(4);
        list.addToFront(5);
        list.addToFront(6);
        list.removeFromRear();
        list.removeFromFront();

        for(Integer i: list){
            System.out.println(i);
        }
        System.out.println("size:" + list.count());
    }
}
