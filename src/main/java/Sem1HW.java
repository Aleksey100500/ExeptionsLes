import java.io.File;

public class Sem1HW {
    public static void main(String[] args) {
        // System.out.println(divide(5,0));
        // ints();
        // arrExeption();
        int[] array1 = new int[] {1, 2, 3, 4, 5};
        int[] array2 = new int[] {2, 3, 4, 5, 6, 7};
        int[] result = hw(array2, array1);
        for (int i:result){
            System.out.println(i);
        }
    }

    private static int divide(int a, int b) {
        // 1 исключение - деление на 0 ArithmeticException.
        return a/b;
    }
    private static void ints() {
        // 2 исключение - выход за границы массива ArrayIndexOutOfBoundsException.
        int[] array = new int[10];
        System.out.println(array[11]);
    }
    private static void arrExeption() {
        // 3 исключение - ArrayStoreException
        Object x[] = new String[5];
        x[0] = new Integer(0);
    }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    private static int[] hw(int[] array, int[] array2) {
        int[] result = new int[array.length];
        if (array.length != array2.length) {
            throw new RuntimeException("The lengths of the arrays are not equal.");
        }
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] - array2[i];
        }
        return result;
    }
}
