package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/* Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке */

        int a = 0;
        int arr[] = new int[15];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(100);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0)
            a++;
        }

        System.out.println(" ");
        System.out.println("Всего четных чисел " + a);

    }
}

