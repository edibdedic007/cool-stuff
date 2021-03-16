package doublyLinkedList;

public class main {
    public static void main(String[] args){
        doublyLinkedList<Integer> list = new doublyLinkedList<Integer>();

        list.addToRear(1);
        list.addToRear(2);
        list.addToRear(3);
        list.addToRear(4);
        for(Integer i: list){
            System.out.println(i);
        }
        list.addToFront(5);
        list.addToFront(6);
        for(Integer i: list){
            System.out.println(i);
        }
        list.removeFromRear();
        for(Integer i: list){
            System.out.println(i);
        }
        list.removeFromFront();
        for(Integer i: list){
            System.out.println(i);
        }


        System.out.println("size:" + list.count());
    }
}
