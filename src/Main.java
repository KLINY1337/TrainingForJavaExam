import ticket21.UniversalClassForSearcher;
import ticket22.UniversalClassForSorter;
import ticket25.CustomStackOnList;
import ticket26.CustomArrayList;
import ticket29.CustomStack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UniversalClassForSearcher searcher = new UniversalClassForSearcher();
        Integer[] array = new Integer[]{3,2,1};
        System.out.println(searcher.search(array,1));
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