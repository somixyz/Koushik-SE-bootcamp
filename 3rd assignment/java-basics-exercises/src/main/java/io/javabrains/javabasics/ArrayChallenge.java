package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] niz = new int[]{10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        int max = niz[0];

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for (int i = 0; i < niz.length; i++){
            sum += niz[i];
            if (niz[i]>max){
                max = niz[i];
            }
        }
        Float sumFloat = Float.valueOf(sum);
        System.out.println("Max number: " + max + " sum number: " + sum + "average number: " + sumFloat/niz.length);

    }
}
