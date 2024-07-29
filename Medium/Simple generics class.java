import java.util.Arrays;
class GenericSorter<T extends Comparable<T>> {
    private T[] array;
    GenericSorter(T[] array) {
        this.array = array;
    }
    void sort() {
        Arrays.sort(array);
    }
    void display() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        intSorter.sort();
        intSorter.display();       
        String[] strArray = {"Banana", "Apple", "Cherry"};
        GenericSorter<String> strSorter = new GenericSorter<>(strArray);
        strSorter.sort();
        strSorter.display();
    }
}
