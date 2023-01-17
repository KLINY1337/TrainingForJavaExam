import ticket21.UniversalClassForSearcher;
import ticket22.UniversalClassForSorter;
import ticket25.CustomStackOnList;
import ticket26.CustomArrayList;
import ticket29.CustomStack;
import ticket9.LinkedIntList;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "string 1");
        map.put(2, "string 2");
        map.put(3, "string 3");
        map.put(4, "string 3");

        Map<String, Integer> map2 = reverse(map);
        System.out.println(map.toString());
        System.out.println(map2.toString());
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
    //Билет 4
    public boolean hasOdd(Set<Integer> set){
        if (set.isEmpty()) return false;

        for (Integer el : set){
            if (el%2!=0) return true;
        }
        return false;
    }
    // Билет 2
    public static Map<String, Integer> reverse(Map<Integer,String> map){
        Map<String,Integer> newMap = new HashMap<>();


        for (Map.Entry<Integer,String> entry : map.entrySet()){
            int key = entry.getKey(); String value = entry.getValue();
            newMap.put(value,key);
        }
        return newMap;
    }
}