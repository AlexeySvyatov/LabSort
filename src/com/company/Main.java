package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void quickSort(int[] array, int low, int high){
        if (array.length==0)
            return;
        if (low>=high)
            return;
        int middle = low + (high-low)/2;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora){
                i++;
            }
            while (array[j] > opora){
                j--;
            }
            if (i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args){
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                matrix[i][j] = new Random().nextInt(10);
            }
        }
        System.out.println("Было");
        for (int v = 0; v < 5; v++) {
            System.out.println(Arrays.toString(matrix[v]));
        }

        int low = 0;
        int high = matrix.length - 1;
        System.out.println("Стало");
        for (int h = 0; h < 5; h++) {
            quickSort(matrix[h], low, high);
            System.out.println(Arrays.toString(matrix[h]));
        }
    }
}