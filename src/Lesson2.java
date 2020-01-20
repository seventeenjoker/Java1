import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.scene.effect.Blend;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        // 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] arr1 = {1, 0, 0, 0, 1};
        inversionArray(arr1);

        // 2 Задать пустой целочисленный массив размером 8.
        // Написать метод, который с помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        int[] arr2 = new int[8];
        fillArray(arr2);

        // 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        // написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplication(arr3);

        // 4 Задать одномерный массив.
        // Написать методы поиска в нём минимального и максимального элемента;
        int[] arr4 = {1, 5, 10, 4, 100, 98};
        largestNum(arr4);
        smallestNum(arr4);

        // 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        // заполнить его диагональные элементы единицами, используя цикл(ы);
        int[][] arr5 = new int[5][5];
        fillSquare(arr5);

        // 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
        // checkBalance ([10, || 1, 2, 3, 4]) → true.
        // Абстрактная граница показана символами ||, эти символы в массив не входят.
        int[] arr6 = {10, 1, 2, 3, 4, 2, 1, -1};
        System.out.println(checkBalance(arr6));
        
    }

    public static void inversionArray( int arr[] ){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }

    public static void fillArray(int arr[]){
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] + 3;
        }
    }

    public static void multiplication(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i] < 6) ? arr[i] * 2: arr[i];
        }
    }

    public static void largestNum(int arr[]){
        int max = arr[0];
        if(arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                max = (arr[i] > max) ? arr[i]: max;
            }
        }
    }

    public static void smallestNum(int arr[]){
        int min = arr[0];
        if(arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                min = (arr[i] < min) ? arr[i]: min;
            }
        }
    }

    public static void fillSquare(int arr[][]){
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[1].length; j++){
                arr[i][j] = ((i + j == arr.length - 1) || (i == j)) ? 1 : 0;
            }
        }
    }

    public static Boolean checkBalance(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int sumLeft = 0;
            int sumRight = 0;
            for(int j = 0; j < i; j++){
                sumLeft += arr[j];
            }
            for(int k = i; k < arr.length; k++){
                sumRight += arr[k];
            }
            if(sumLeft == sumRight){
                return true;
            }
        }
        return false;
    }


}
