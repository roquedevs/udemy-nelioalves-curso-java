package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> listDouble = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Object> listObject = new ArrayList<>();

        copy(listInteger, listObject);
        printList(listObject);
        copy(listDouble, listObject);
        printList(listObject);
    }

    private static void printList(List<?> list) {
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }

    private static void copy(List<? extends Number> sourceList, List<? super Number> destinationList) {
        for (Number number : sourceList) {
            destinationList.add(number);
        }
    }
}
