package Two_Chainz;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        //we create two stacks
        Stack<Double> values = new Stack<Double>(); //for value,
        Stack<String> operators = new Stack<String>(); //and for storing numbers

        //we implement the scanner utility so we can give user the option to manually enter expressions that will be put into the nodes
        Scanner input = new Scanner(System.in);
        String[] node = input.nextLine().split(" "); //after each expression there should be a space
        for(int i=0; i<node.length; i++){ // loop through possible given expressions
            if (node[i].equals("(")){}
            else if(node[i].equals("+")) {
                operators.push(node[i]);
            }
            else if (node[i].equals("-")){
                operators.push(node[i]);
            }
            else if (node[i].equals("*")){
                operators.push(node[i]);
            }
            else if (node[i].equals("/")){
                operators.push(node[i]);
            }
            else if (node[i].equals("%")){
                operators.push(node[i]);
            }
            else if (node[i].equals(")")){

                String o = operators.pop();
                double v = values.pop();
                if(o.equals("+"))
                {
                    v = values.pop() + v;
                }
                else if (o.equals("-"))
                {
                    v = values.pop() - v;
                }
                else if (o.equals("*"))
                {
                    v = values.pop() * v;
                }
                else if (o.equals("/"))
                {
                    v = values.pop() / v;
                }
                else if (o.equals("%"))
                {
                    v = values.pop() % v;
                }
                values.push(v);
            }
            else
                {
                values.push(Double.parseDouble(node[i]));
                }
        }
        System.out.println(values.pop());


    }
}
