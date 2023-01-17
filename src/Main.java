import ticket21.UniversalClassForSearcher;
import ticket22.UniversalClassForSorter;
import ticket25.CustomStackOnList;
import ticket26.CustomArrayList;
import ticket29.CustomStack;
import ticket9.LinkedIntList;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        LinkedIntList list=new LinkedIntList();
        list.add(14);
        list.add(8);
        list.add(14);
        list.add(12);
        list.add(1);
        list.add(14);
        list.add(11);
        list.add(8);
        list.add(8);
        list.add(10);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(12);
        list.printList();
        System.out.println("\n");
        list.removeDuplicates();
        list.printList();
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

    //Билет 14
    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2){
        Stack<Integer> container = new Stack<>();

        //return stack1.equals(stack2);

        if (stack1.size() != stack2.size()) return false;

        while (!stack1.isEmpty()){
            if (stack1.peek() == stack2.peek()){
                container.push(stack1.pop());
                container.push(stack2.pop());
            }
            else return false;
        }
        while(!container.isEmpty()){
            stack2.push(container.pop());
            stack1.push(container.pop());
        }
        return true;
    }
}