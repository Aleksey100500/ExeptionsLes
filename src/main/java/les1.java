import java.io.File;

public class les1 {
    // План урока
    // Откуда берутся ошибки?
    // Как программа оповещает об ошибках с помощью кодов ошибок?
    // Как программа оповещает об ошибках с помощью исключений?
    // Зачем обрабатывать ошибки?
    // Пример обработки ошибок

    // Отказоустойчивые приложения —
    //приложения, которые могут продолжать
    //свою работу при возникновении
    //некритичных ошибок.

    // Откуда берутся ошибки при написании программ?

    // Разработчик не учёл ситуацию, которая привела к ошибке.

    // При работе приложения внешняя среда так изменила состояние, что программа не может дальше
    // корректно выполнять операцию.

    // В используемых библиотека есть баги, которые не позволяют
    // корректно выполнять задачу.

    // Код ошибки — целочисленный код, указывающий на причину
    //ошибки.

    // Недостатки использования кодов ошибок
    //Зачастую невозможно отличить код ошибки от результата исполнения
    //метода.
    //Разработчик может забыть о том, что метод возвращает коды ошибок, и
    //просто не будет их обрабатывать.
    //Нельзя «заставить» разработчика на этапе компиляции проверять
    //критические ошибки.
    //Код ошибки не может предоставить детальную информацию, почему
    //эта ошибка возникла.
    //В Java метод не может возвращать одновременно два типа данных (int
    //для кодов ошибок и Object для «полезного» результата).

    // Исключения — это специальный тип
    //объектов, которые создаются при
    //возникновении ошибочной ситуации и
    //выбрасываются джава машиной.


    public static void main(String[] args) {
        // System.out.println(getFileSize(new File("123")));
        System.out.println(devide(10,0));
//        a();
    }
    public static int devide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Divide by zero no permited.");
        }
        return a/b;
    }
//    public static void a(){
//        b();
//    }
//
//    public static void b(){
//        c();
//    }
//
//    public static void c(){
//        int[] ints = new int[10];
//        System.out.println(ints[1000]);
//    }
//    public static long getFileSize(File file) {
//        if (!file.exists()) {
//            return -1L;
//        }
//        return file.length();
//    }
//
//    public static int devide(int a1, int a2) {
//        if (a2 == 0) {
//            return -1;
//        }
//        return a1/a2;
//    }

    // Выводы
    //Существует два основных подхода к сигнализации об ошибках, возникающий в процессе
    //исполнения: коды ошибок и исключения.

    //В большинстве современных языков программирования используются именно
    //исключения.

    //Исключения позволяют гораздо более гибко «оповещать» разработчика об ошибках и
    //также более гибко их обрабатывать.
}
