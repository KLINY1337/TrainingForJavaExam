package ticket29;

public class CustomStack<Type> {

    private Type[] container;
    private int size = 0;
    private int length = 0;
    public CustomStack(int size){
        this.size = size;
        container = (Type[]) new Object[size];

        for (Type el : container){
            el = null;
        }
    }

    public Type push(Type element){
        if (length < size){
            container[length] = element;
            length++;
            return element;
        }
        return null;
    }

    public Type pop(){
        Type result = null;

        result = container[length-1];
        container[length-1] = null;
        length--;
        return result;
    }

    public Type peek(){
        return container[length-1];
    }

    public Type[] getArray(){
        Type[] array = (Type[]) new Object[length];
        int index = 0;
        for (Type el : container){
            if (el != null){
                array[index] = el;
                index++;
            }
        }
        return array;
    }
}

    /*CustomStack<Integer> stack = new CustomStack<>(10);
        stack.push(5);
                stack.push(6);
                stack.push(1);
                stack.push(2);
                System.out.println(Arrays.toString(stack.getArray()));

                System.out.println(stack.peek());

                stack.pop();
                System.out.println(stack.peek());
                stack.pop();

                System.out.println(Arrays.toString(stack.getArray()));*/
// Напишите реализацию структуры данных Stack на массиве. При реализации необходимо использовать дженерики.