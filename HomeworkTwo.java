/**
* Geekbrains. Java 1. Homework #2
*
* @author Ryabov Maxim
* @version 16.02.2022
*/
public class HomeworkTwo {
    public static void main(String[] args) {
        System.out.println(checkSum(6, 3));
        checkNum (5);
        System.out.println(checkNumNegative(0));
        stringsNum();
	}
    
    public static boolean checkSum( int a, int b) {
        return a + b >= 10 & a + b <= 20;
    }
    
    public static void checkNum (int a) {
        if (a >= 0){
            System.out.println("Num is Positive");
        } else {
            System.out.println("Num is Negotive");
        }
    }    
    
    public static boolean checkNumNegative(int a) {
        if (a <0) {
            return true;
        } else {
            return false;
        }
    }    
    
    public static void stringsNum() {
        String str = "Some words";
        int a = 6;
        for (int i = 1; i <= a; i ++) {
            System.out.println(str);
        }
    }
}