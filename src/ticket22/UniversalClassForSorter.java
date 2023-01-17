package ticket22;

import java.util.Comparator;

public class UniversalClassForSorter{

    /*public static class ComparatorRealizer implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            return (int)o1 < (int)o2 ? -1 : (int)o1 > (int)o2 ? 1 : 0;
        }
    }
    public void sort(Object[] array, ComparatorRealizer comparator){
        for (int i=0;i<array.length;i++)
            for (int j=i+1;j<array.length;j++)
                if (comparator.compare(array[i], array[j]) == 1) {
                    Object temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
    }*/

    public void sort(Comparable[] array){
        for (int i=0;i<array.length;i++)
            for (int j=i+1;j<array.length;j++)
                if (array[i].compareTo(array[j]) == 1) {
                    Comparable temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
    }
}

    /*UniversalClassForSorter sorter = new UniversalClassForSorter();
            Object[] arr = new Object[]{3,2,1};
            System.out.println(Arrays.toString(arr));
            sorter.sort(arr, new UniversalClassForSorter.ComparatorRealizer());
            System.out.println(Arrays.toString(arr));*//*
    UniversalClassForSorter sorter=new UniversalClassForSorter();
    Integer[] arr = new Integer[]{3,2,1};
        System.out.println(Arrays.toString(arr));
                sorter.sort(arr);
                System.out.println(Arrays.toString(arr));*/
// Билет 22 (Напишите универсальный класс для реализации алгоритмов сортировок. В качестве параметров используйте массив интерфейсных ссылок)