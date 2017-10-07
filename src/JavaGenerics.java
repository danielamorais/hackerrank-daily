import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Printer {

    void printArray(Object[] array) {
        for (Object obj : array) {
            System.out.println(obj);
        }
    }

    void printArray(List<?> array) {
        array.forEach(System.out::println);
    }

}


public class JavaGenerics {
    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        List<Integer> integerArray = new ArrayList<>(Arrays.asList(intArray));
        List<String> stringArrayList = new ArrayList<>(Arrays.asList(stringArray));

        myPrinter.printArray(integerArray);
        myPrinter.printArray(stringArrayList);
    }
}
