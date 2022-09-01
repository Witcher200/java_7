package Java_level_1_3;

import java.util.Arrays;
import java.util.Random;

public class Java_lesson_3 {

    public static void main(String[] args) {
        // System.out.println("Ex 1");
        // ex1();
        //   System.out.println("Ex 2");
        // ex2();
        //  System.out.println("Ex 3");
        //    ex3();
          System.out.println("Ex 4");
            ex4();
        //    System.out.println("Ex 5");
        //      ex5(5, 7);
        //  System.out.println("Ex 6");

        // ex6(10);
       // ex6(15);
    }

    public static void ex1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {

            System.out.print(i + ":");
            System.out.println(arr[i]);

            if (arr[i] == 0) {
                System.out.println(1);
                arr[i] = 1;
            } else if (arr[i] == 1) {
                System.out.println(0);
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void ex2() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.print(i + ":");
            System.out.println(arr2[i] + "");
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void ex3() {
        int[] arr3 = new int[20];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
            System.out.print(i + ":");
            Random rand = new Random();
            int x = rand.nextInt(20);
            System.out.println(x);
        }
    }

    public static void ex4() {
  //      int counter = 1;
        int[][] arr4 = new int[20][20];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
              if (i == 19-j){
                  arr4[i][j] = 1;

              } else
                if (i == j){
                    arr4[i][j] = 1;

                }

                System.out.print(arr4[i][j] + " ");
            //    counter++;
            }
            System.out.println();
        }
    }

    public static void ex5(int len, int initialValue) {
        //Иницилизация массива
        int[] arr5 = new int[len];
        //Цикл
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;   // Запись в массив;
            //Вывод на экран
            System.out.println("arr5[" + i + "] = " + arr5[i]);
        }
    }

    static void ex6(int arrsize) {
        int[] arr6 = new int[arrsize];
        Random rand = new Random();
        for (int i = 0; i < arr6.length; i++) {
            int x = rand.nextInt(100);
            arr6[i] = x;
            System.out.print(arr6[i] + " ");

        }
        int max = arr6[0];
        int min = arr6[0];
        System.out.println();
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
                //    System.out.println("Макс сохранили");
            } else {
                //  System.out.println("Макс больше");
            }
            //System.out.println(arr6[i] + " " + max);

            if (arr6[i] < min) {
                min = arr6[i];
             //   System.out.println("Мин сохранили");
            }else {
             //   System.out.println("Мин больше");
            }
           // System.out.println(arr6[i] + " " + min);
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
    }
}


