import java.util.InputMismatchException;
import java.util.Scanner;

public class Sem2HW {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {
        numb();
    }
    private static void numb() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        try {
            float number = sc.nextFloat();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("Your number is of a different data type");
            numb();
        }
    }
}
