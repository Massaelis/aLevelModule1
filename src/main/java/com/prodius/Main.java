package com.prodius;

public class Main {
    public static void main(String[] args) {
        Array arrayCreator = new Array();
        int[] array = arrayCreator.createArray();
        arrayCreator.bubbleSort(array);
        arrayCreator.cube(array);
    }
}