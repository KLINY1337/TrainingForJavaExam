package ticket26;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomArrayList<Type> {
    List<Type> container = new LinkedList<>();
    public boolean add(Type element){
        return container.add(element);
    }

    public void clear(){
        container.clear();
    }

    public boolean contains(Type element){
        return container.contains(element);
    }

    public Type get(int index){
        return container.get(index);
    }

    public List<Type> getContainer(){
        return container;
    }
}

/*
    CustomArrayList<Integer> arrayList = new CustomArrayList<>();

        arrayList.add(5);
                arrayList.add(6);
                arrayList.add(1);

                System.out.println(arrayList.getContainer().toString());*/
// Напишите реализацию структуры ArrayList на списке