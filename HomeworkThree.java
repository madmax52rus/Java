/**
* Geekbrains. Java 1. Homework #3
*
* @author Ryabov Maxim
* @version 25.02.2022
*/

import java.util.Arrays;
import java.util.Random;

class HomeworkThree {
    public static void main(String[] args) {
    
        System.out.println("Item 1");
        
        int[] arrInvert = { 1, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(arrInvert));
        for (int i = 0; i < arrInvert.length; i++) {
            arrInvert[i] = 1 - arrInvert[i];
        }
        System.out.println(Arrays.toString(arrInvert));        
              
        System.out.println("Item 2");
       
        int[] arrFilled = new int[100];
        for (int i = 0; i < arrFilled.length; i++) {
            arrFilled[i] = i + 1;
        }    
        System.out.println(Arrays.toString(arrFilled));     
        
        System.out.println("Item 3");
    
        int[] arrChange = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arrChange.length; i++) {
            if (arrChange[i] < 6) {
                arrChange[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrChange));      

        System.out.println("Item 4");        

        int[][] arrDiagonal = new int[6][6];
        for (int i = 0; i < 6; i++) {
            arrDiagonal[i][i] = 1;
            arrDiagonal[i][arrDiagonal.length -i -1] = 1;
            System.out.println(Arrays.toString(arrDiagonal[i]));
        }
        
        // System.out.println("Item 5");    
        
        int[] arrCreate = arrCreate(14, 8);
        System.out.println(Arrays.toString(arrCreate));
    }   
        
    static int[] arrCreate(int len, int initialValue) {
        int arr[] = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}    
