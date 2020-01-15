public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(calc(2.4f, 2.9f, 1.5f, 5.7f));
        System.out.println(checkSumNumbers(1, 13));
        isPositive(5);
        System.out.println(isNegative(5));
        grettings("Peter");
        checkYear(1988);

    }
    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float calc(float a, float b, float c, float d){
        float result = a * (b + (c / d));
        return result;
    }

    // Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean checkSumNumbers(int a, int b){
        if((a + b) >= 10 && (a + b) <= 20){
            return true;
        } else {
            return false;
        }
    }

    // Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static void isPositive(int i){
        if(i >= 0){
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    // Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное.
    public static boolean isNegative(int i){
        if(i < 0){
            return true;
        }
        return false;
    }

    // Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void grettings(String name){
        System.out.println("Hello " + name + "!");
    }

    // Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkYear(float year){
        if(((year % 4) != 0) || ((year % 100 == 0) && (year % 400) != 0)){
            System.out.println("Год не високосный.");
        } else {
            System.out.println("Год високосный.");
        }
    }

}
