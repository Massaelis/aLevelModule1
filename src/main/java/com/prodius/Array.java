package com.prodius;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public int[] createArray() {
        int[] array = new int[getArrayLength()];
        array = random.ints(array.length, -100, 100).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }
    private int getArrayLength() {
        int length = 0;
        System.out.print("Write 10 or bigger: ");
        if (scanner.hasNextInt()) {
            length = scanner.nextInt();
        }
        scanner.nextLine();
        return length >= 10 ? length : getArrayLength();
    }
    public int[] bubbleSort(int[] array) {
        System.out.println("1 for ascending method or 2 for descending method");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i == 1) {
            return ascendingMethod(array);
        } else if (i == 2) {
            return descendingMethod(array);
        } else {
            System.out.println("Wrong number");
        }
        return array;
    }
    private int[] ascendingMethod(int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) { // < or >
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    private int[] descendingMethod(int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) { // < or >
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    public int[] cube(int[] array) {
        for (int i = 2; i < array.length; i+=3) {
            array[i] = array[i] * array[i] * array[i];
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}