package ticket25;

import java.util.ArrayList;
import java.util.List;

public class CustomStackOnList<Type> {
    private List<Type> container = new ArrayList<>();

    public boolean push(Type element){
        return container.add(element);
    }

    public Type pop(){
        return container.remove(container.size()-1);
    }

    public Type peek(){
        return container.get(container.size()-1);
    }

    public List<Type> getArray(){
        return container;
    }
}

/*    CustomStackOnList<Integer> stack = new CustomStackOnList<>();

        stack.push(5);
                stack.push(6);
                stack.push(1);
                stack.push(2);
                System.out.println(stack.getArray().toString());

                System.out.println(stack.peek());

                stack.pop();
                System.out.println(stack.peek());
                stack.pop();

                System.out.println(stack.getArray().toString());*/
// Билет 25 (Напишите реализацию структуры данных Stack на списке)
