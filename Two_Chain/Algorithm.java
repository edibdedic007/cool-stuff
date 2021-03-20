package Two_Chain;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        //we create two stacks
        Stack<Double> values = new Stack<Double>(); //for value,
        Stack<String> operators = new Stack<String>(); //and for storing numbers

        //we implement the scanner utility so we can give user the option to manually enter expressions
        Scanner input = new Scanner(System.in);
        String[] tokens = input.nextLine().split(" ");
        for(int i=0; i<tokens.length; i++){
            if (tokens[i].equals("(")){
                operators.push(tokens[i]);
            }
            else if(tokens[i].equals("+")) {
                operators.push(tokens[i]);
            }
            else if (tokens[i].equals("-")){
                operators.push(tokens[i]);
            }
            else if (tokens[i].equals("*")){
                operators.push(tokens[i]);
            }
            else if (tokens[i].equals("/")){
                operators.push(tokens[i]);
            }
            else if (tokens[i].equals("%")){
                operators.push(tokens[i]);
            }
            else if (tokens[i].equals(")")){
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
                    Math.sqrt(v);
                }
                values.push(v);
            }
            else
                {
                values.push(Double.parseDouble(tokens[i]));
                }
        }
        System.out.println(values.pop());


    }
}
