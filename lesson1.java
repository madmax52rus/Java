public class HomeworkOne {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }
    static void checkSumSign() {
            int a = 10, b = -15;
            System.out.println(a + b >= 0? "Сумма положительная" : "Сумма отрицательная");
    }
    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
    }
        if (value > 0 && value <= 100) {
            System.out.println ("Жёлтый");
    }
        if (value > 100) {
            System.out.println ("Зелёный");
    }
    }
        static void compareNumbers() {
            int a = 10, b = 15;
            if (a >=b) {
                System.out.println("a >= b");
            }
            else {
                System.out.println("a < b");
            }
        }
    }
