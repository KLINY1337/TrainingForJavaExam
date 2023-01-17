package ticket21;

public class UniversalClassForSearcher {
    public int search(Comparable[] array, Comparable element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(element) == 0) return i;
        }

        return -1;
    }
}

    /*UniversalClassForSearcher searcher = new UniversalClassForSearcher();
    Integer[] array = new Integer[]{3,2,1};
        System.out.println(searcher.search(array,1));*/
// Билет 21 (Напишите универсальный класс для реализации алгоритмов поиска. В качестве параметров используйте массив интерфейсных ссылок)