package stackedArrays;

public class main {
    public static void main (String[] args){
        stackedArrays<Integer> stack = new stackedArrays<Integer>();

        stack.push(2);
        stack.push(8);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(10);
        System.out.println("Size:"+stack.size());
    }
}
