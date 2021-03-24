package com.jxxg.algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {64, 256, 2, 512, 32, 1024, 1, 0, 4, 8, 128, 16};
        //insertionSort(array);
        mergeSort(array, 0, array.length - 1);
        for(int t:array) {
            System.out.println(t);
        }
    }
    
    // public static void insertionSort(int[] array) {
    //    for(int j = 1; j < array.length; j++) {
    //         int temp = array[j];
    //         int i = j - 1;
    //         while(i >= 0 && array[i] > temp) {
    //             array[i + 1] = array[i];
    //             i--;
    //         }
    //         array[i + 1]=temp;
    //     }
    // }
    
    public static void mergeSort(int[] array, int p, int r) {
        if(p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }
    
    public static void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }
        for(int i = 0; i < n2; i++) {   
            R[i] = array[q + i + 1];
        }
        int i = 0;
        int j = 0;
        for(int k = p; k < r; k++) {
            if(L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
        }
    }
}
