import ticket22.UniversalClassForSorter;
import ticket25.CustomStackOnList;
import ticket26.CustomArrayList;
import ticket29.CustomStack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*UniversalClassForSorter sorter = new UniversalClassForSorter();
        Object[] arr = new Object[]{3,2,1};
        System.out.println(Arrays.toString(arr));
        sorter.sort(arr, new UniversalClassForSorter.ComparatorRealizer());
        System.out.println(Arrays.toString(arr));*/
        UniversalClassForSorter sorter=new UniversalClassForSorter();
        Integer[] arr = new Integer[]{3,2,1};
        System.out.println(Arrays.toString(arr));
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
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