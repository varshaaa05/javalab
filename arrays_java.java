package com.jit.thirdsem;

import java.util.Scanner;

public class arrays_java {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt(); 
        }
        
        int largest = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        
        System.out.println("Largest element in the array is: " + largest);
        scn.close(); 
    }
}
