import ticket29.CustomStack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    //Билет 15
    public static Stack<Integer> splitStack(Stack<Integer> stack){
        Queue<Integer> queue = new LinkedList<Integer>();

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        while (!queue.isEmpty()){
            int negativeCounter = 0;
            for (int el : queue){
                if (el<0) negativeCounter++;
            }
            if (negativeCounter > 0){
                if (queue.peek() < 0) stack.push(queue.remove());
                else{
                    queue.add(queue.remove());
                }
            }
            else{
                while (!queue.isEmpty()){
                    stack.push(queue.remove());
                }
            }
        }
        return stack;
    }
}