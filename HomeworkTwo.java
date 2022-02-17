/**
* Geekbrains. Java 1. Homework #2
*
* @author Ryabov Maxim
* @version 17.02.2022
*/
public class HomeworkTwo {
    
    public static void main(String[] args) {
        System.out.println(checkSum(6, 3));
        checkNum (0);
        System.out.println(checkNumNegative(0));
        repeatString("word", 6);
    }
    
    static boolean checkSum( int a, int b) {
        return a + b >= 10 & a + b <= 20;
    }
    
    static void checkNum (int a) {
        System.out.println(a >= 0? "Num is Positive" : "Num is Negotive");
    }    
    
    static boolean checkNumNegative(int a) {
        return a < 0;
    }    
    
    static void repeatString(String str, int count) {
        for (int i = 0; i < count; i ++) {
            System.out.println(str);   
        }
    }
}
