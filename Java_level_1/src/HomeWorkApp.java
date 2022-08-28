/** Создание класс HomeWorkApp**/
public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    /**
     * Создание метода printThreeWords, кльлоый пои выхлве должен отпечатать в столбец три слова
     **/
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * Создание метода checkSumSign сумирующий два числа
     **/
    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int c = (a - b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("c =" + c);
    }

    /**
     * Создание метода print color,который при выполнении выдает цвет, оответствующий определеннуму числу
     **/
    public static void printColor() {
        int values = 110;
        if (values <= 0) {
            System.out.println("Красный");
        } else if (values <= 100) {
            System.out.println("Желтый");
        }
        if (values > 100) {
            System.out.println("Зеленый");
        }
    }

    /**
     * Создание метода compareNumber, сравнивающий два числа
     **/
    public static void compareNumbers() {
        int a = 3;
        int b = 4;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }
}



